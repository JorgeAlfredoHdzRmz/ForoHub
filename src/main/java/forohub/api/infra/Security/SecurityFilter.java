//package forohub.api.infra.Security;
//
//import forohub.api.domain.usuarios.UsuariosRepository;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class SecurityFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private TokenService tokenService;
//
//    @Autowired
//    private UsuariosRepository usuariosRepository;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        //Obtener el token del header
//        var authHeader = request.getHeader("Authorization");//.replace("Bearer ","");
//        if(authHeader != null){
//            System.out.println("valida token no nulo");
//            var token = authHeader.replace("Bearer ","");
//            var subject = tokenService.getSubject(token);
//            if(subject != null){
//                //token valido
//                var usuario = usuariosRepository.findByLogin(subject);
//                var authentication = new UsernamePasswordAuthenticationToken(usuario,null,usuario.getAuthorities());
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        }
//        filterChain.doFilter(request,response);
//    }
//
//
//}
package forohub.api.infra.Security;

import forohub.api.domain.usuarios.UsuariosRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Obtener el token del header
        var authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
            System.out.println("Authorization header: " + authHeader);
            System.out.println("Valida token no nulo");
            var token = authHeader.replace("Bearer ", "");
            System.out.println("Token after replacing 'Bearer ': " + token);
            try {
                var subject = tokenService.getSubject(token);
                if (subject != null) {
                    // Token válido
                    var usuario = usuariosRepository.findByLogin(subject);
                    var authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                } else {
                    System.out.println("Subject is null, token might be invalid.");
                }
            } catch (RuntimeException e) {
                System.out.println("Error getting subject from token: " + e.getMessage());
            }
        } else {
            System.out.println("Authorization header is null.");
        }
        filterChain.doFilter(request, response);
    }
}
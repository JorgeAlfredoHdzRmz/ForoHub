Challenge ForoHub de Alura utilizando Spring Framework, en donde se puso en practica el mapeo y uso de peticiones, DTO, e interaccion con la base de datos.

Algunas migraciones no se incluyeron en este repositorio debido a un problema con Flyway, en donde se tuvo que manejar a nivel gestor base de datos.

Adjunto el JSON para que puedas importar los requests en Postman y puedas probar el codigo
{
	"info": {
		"_postman_id": "1e624c10-e556-4c83-8258-04aa576b0fad",
		"name": "Foro Hub EndPoints",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "34561934"
	},
	"item": [
		{
			"name": "Topicos",
			"item": [
				{
					"name": "insertar topico",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"titulo\": \"Como hago una red neuronal\",\r\n    \"idusuario\": \"2\",\r\n    \"idcurso\": \"5\",\r\n    \"mensaje\": \"necesito ayuda para una red neuronal D:\"\r\n    \r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/topicos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Topicos Activos",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/topicos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Topico individual",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/topicos/10",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos",
								"10"
							]
						}
					},
					"response": []
				},
				{
					"name": "Actualizar Topicos",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"id\": 6,\r\n    \"titulo\": \"Ya no estoy probando endpoints variados\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/topicos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Eliminar Topico",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/topicos/7",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos",
								"7"
							]
						}
					},
					"response": []
				},
				{
					"name": "Deshabilitar topico",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yZ2VBbGZyZWRvIiwiaWQiOjEsImV4cCI6MTcyMDA3ODQxNX0.ZDHrceFC8aP7fGs3pYRrfnLLeOI4ZNzaNgiqYywD0-I",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/topicos/desactivar/8",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos",
								"desactivar",
								"8"
							]
						}
					},
					"response": []
				},
				{
					"name": "Habilitar Topico",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yZ2VBbGZyZWRvIiwiaWQiOjEsImV4cCI6MTcyMDA3ODQxNX0.ZDHrceFC8aP7fGs3pYRrfnLLeOI4ZNzaNgiqYywD0-I",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/topicos/activar/8",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"topicos",
								"activar",
								"8"
							]
						}
					},
					"response": []
				}
			],
			"description": "Endpoints Topicos"
		},
		{
			"name": "Cursos",
			"item": [
				{
					"name": "Insertar Cursos",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"nombre\": \"Excel\",\r\n    \"categoria\": \"Ofimatica\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/cursos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"cursos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Curso individual",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/cursos/5",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"cursos",
								"5"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Cursos",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/cursos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"cursos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Actualizar Curso",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"id\": 5,\r\n    \"categoria\": \"Inteligencia Artificial\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/cursos",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"cursos"
							]
						}
					},
					"response": []
				},
				{
					"name": "Eliminar Curso",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/cursos/6",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"cursos",
								"6"
							]
						}
					},
					"response": []
				}
			],
			"description": "Endpoints Cursos"
		},
		{
			"name": "Respuestas",
			"item": [
				{
					"name": "Insertar Respuesta",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"mensaje\": \"ya se como\",\r\n    \"idtopico\": \"10\",\r\n    \"idusuario\": \"2\",\r\n    \"solucion\": \"con python\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/respuestas",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"respuestas"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Respuesta Individual",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/respuestas/4",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"respuestas",
								"4"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Respuestas",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/respuestas",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"respuestas"
							]
						}
					},
					"response": []
				},
				{
					"name": "Actualizar Respuesta",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"id\": 4,\r\n    \"mensaje\": \"editando el mensaje de la respuesta\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/respuestas",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"respuestas"
							]
						}
					},
					"response": []
				},
				{
					"name": "Eliminar Respuestas",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/respuestas/5",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"respuestas",
								"5"
							]
						}
					},
					"response": []
				}
			],
			"description": "Endpoints Respuestas"
		},
		{
			"name": "Usuarios",
			"item": [
				{
					"name": "Insertar Usuario",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"nombre\": \"Alfredo Hernandez\",\r\n    \"login\": \"satinz3r0\",\r\n    \"clave\": \"Contra24!\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/usuarios",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"usuarios"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Usuario Individual",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/usuarios/4",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"usuarios",
								"4"
							]
						}
					},
					"response": []
				},
				{
					"name": "Listar Usuarios",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/usuarios",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"usuarios"
							]
						}
					},
					"response": []
				},
				{
					"name": "Actualizar Usuarios",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"id\": 1,\r\n    \"nombre\": \"nomrbe nuevo\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/usuarios",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"usuarios"
							]
						}
					},
					"response": []
				},
				{
					"name": "Eliminar Usuarios",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
									"type": "string"
								}
							]
						},
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/usuarios/3",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"usuarios",
								"3"
							]
						}
					},
					"response": []
				}
			],
			"description": "Endpoints Usuarios"
		},
		{
			"name": "Auth Token",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"login\": \"JorgeUser\",\r\n    \"clave\": \"123456\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/login",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"login"
					]
				}
			},
			"response": []
		},
		{
			"name": "Topicos por curso",
			"request": {
				"auth": {
					"type": "bearer",
					"bearer": [
						{
							"key": "token",
							"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/cursos/5/topicos",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"cursos",
						"5",
						"topicos"
					]
				}
			},
			"response": []
		},
		{
			"name": "Respuestas de cada topico",
			"request": {
				"auth": {
					"type": "bearer",
					"bearer": [
						{
							"key": "token",
							"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/topicos/4/respuestas",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"topicos",
						"4",
						"respuestas"
					]
				}
			},
			"response": []
		},
		{
			"name": "Topicos por usuario",
			"request": {
				"auth": {
					"type": "bearer",
					"bearer": [
						{
							"key": "token",
							"value": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmb3JvaHViIiwic3ViIjoiSm9yam9uTWFxdWluYSIsImlkIjoyLCJleHAiOjE3MjA0OTA1NTd9.GM31sm4J-hwatOh4wTpJgojxIotueu0OncefIFrGdCk",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/usuarios/2/topicos",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"usuarios",
						"2",
						"topicos"
					]
				}
			},
			"response": []
		}
	]
}

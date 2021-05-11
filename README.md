# Demo Springboot :leaves:


### Prueba la API :hammer:

> Guardar un nuevo usuario.

`URI:` localhost:8080/users

`BODY:`
```
{
    "name":"Maor",
    "dni": "76453721"
}
```

> Obtener un usuario por {id}.

`URI:` localhost:8080/users/{id}


### Database Connection :floppy_disk:
`Path:` src/main/resources/application.properties
```
spring.datasource.url = jdbc:postgresql://<HOST_IP>:<PORT>/<DATABASE_NAME>?currentSchema=<SCHEMA_NAME>
spring.datasource.username = <USERNAME>
spring.datasource.password = <PASSWORD>
spring.datasource.driver-class-name=org.postgresql.Driver
```


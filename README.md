# teiid-spring-boot-mongodb-odata

## Overview
The project used [Teiid Spring Boot](https://github.com/teiid/teiid-spring-boot) runtime to connect MongoDB database `raasagent` and exposed collections as OData API. It created to showcase complex type `rows` in `matrix_variable` collection doesn't exposed as entity in OData.

## Import MongoDB
First start the MongoDB instance and use the following command to import MongoDB database:
```
mongorestore.exe --host localhost:27017 --db raasagent ./mongodb/raasagent
```
if you have problem import the DB to your MongoDB instance, just create a database name `raasagent` and a collection name `matrix_variable`. The collection only has single document like the json/sample.json file.

## Execution
Execute the following command to run the project locally:
```
mvn spring-boot:run
```

## OData Endpoint
Access the OData endpoint with the following URL:
```
http://localhost:8080/odata/$metadata
```

## Teiid Ticket
```
https://issues.redhat.com/browse/TEIID-5873
```

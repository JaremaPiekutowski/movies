# Movie website with Java Spring Boot, React and MongoDB

An exercise/training project to learn Java, Spring Boot, JavaScript, React and MongoDB.

Link to course: https://www.youtube.com/watch?v=5PdEmeopJVQ


## Prerequisites

- Java(TM) SE Runtime Environment (build 21.0.1+12-LTS-29)
- Apache Maven 3.9.6
- MongoDB database

## Installation - backend

1. Create the local settings file:

```
cp src/main/resources/env.local.example src/main/resources/.env
```

2. Configure your MongoDB database by filling out settings in .env file.

## Run app

```
cd MovieClient\movie-gold-v1
npm start
```

## Run sole backend

From the root folder:
```
mvn spring-boot:run
```

Runs on http://localhost:8080

## Endpoints

- [/api/v1/movies](http://localhost:8080/api/v1/movies) - GET all movies
- [/api/v1/movies/<imdbId>](http://localhost:8080/api/v1/movies) - GET a movie by imdbID
- [/api/v1/reviews](http://localhost:8080/api/v1/reviews) - POST review (reviewBody:str, imdbId:int)
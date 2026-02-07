# Mini Movie Manager – REST API Task
## Overview

This project is a simple Java Spring Boot REST API application created to manage a collection of movies using in-memory storage.
The purpose of this task is to demonstrate understanding of backend fundamentals such as REST endpoints, data handling, DTO usage, validation, and layered architecture without using a database.

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Validation
- Maven

## Functional Requirements Implemented
### 1. Model

A Movie model class is defined with the following properties:

- id (Long)
- title (String)
- genre (String)
- rating (Double)
- duration (Integer – minutes)
- releaseDate (LocalDate)

### 2. In-Memory Data Storage

- Movies are stored using a HashMap.
- No external database is used.
- Data resets when the application restarts.

### 3. API Endpoints
Application runs at:
http://localhost:8080  (for github)
https://minimoviemanager.onrender.com/ (for render)

- Add Movie (Admin Only)

  API : POST /movies/admin/add
  #### Request Body (example)
  {
  "title": "Inception",
  "genre": "Sci-Fi",
  "rating": 9,
  "duration": 148,
  "releaseDate": "2010-07-16"
}

- Get All Movies

  API : GET /movies

- Get Movie By ID

  API : GET /movies/{id}
  #### example: /movies/1001

- Delete Movie (Admin Only)
  
  API : DELETE /movies/admin/delete{id}
  #### example: /movies/admin/delete/1002

- Update Movie (Admin Only)
  API : UPDATE movies/admin/update/{id}
  #### example: movies/admin/update/1001

- Developed by
  API : GET developer
  #### example: https://minimoviemanager.onrender.com/developer

### 4. Input Validation

Validation is applied on request data:

- Title must not be blank
- Rating must be between 1 and 10
- Duration must be greater than 0
- Release date must not be null

### 5. Architecture / Project Structure
- controller  → Handles HTTP requests
- service     → Business logic & DTO mapping
- storage     → In-memory data handling
- model       → Internal movie entity
- dto         → Request & Response objects

### Flow
Client → Controller → Service → Storage → HashMap

### 6. DTO Usage

- MovieReqDto – used for incoming requests
- MovieResDto – used for outgoing responses

This ensures separation between API data and internal model.

### 7. ID Generation

- Movie IDs start from 1001
- IDs are auto-incremented manually.

### Testing the APIs

APIs can be tested using Postman or any REST client.

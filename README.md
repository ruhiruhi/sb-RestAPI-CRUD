Employee Management CRUD API – Spring Boot Project

This project is a RESTful CRUD API built with Spring Boot, designed to manage employee data efficiently. It implements a clean layered structure using Controller, Service, Repository, DTO, and Entity patterns, making the code easy to maintain and scale.

🔹 Key Features

Create new employees

Retrieve all employees or a single employee by ID

Update all employee fields using PUT

Update salary only using PATCH (partial update)

DTO to Entity mapping for clean data flow

JPA Repository for database CRUD operations

Auto-generated date for new records

Proper HTTP status handling (201, 200, 404)

🔹 Tech Stack

Java

Spring Boot

Spring Data JPA

Hibernate

MySQL

Lombok

🔹 API Endpoints
Method	Endpoint	Description
POST	/api/employee	Create new employee
GET	/api/employee	Get all employees
GET	/api/employee/{id}	Get employee by ID
PUT	/api/employee/{id}	Update complete employee details
PATCH	/api/employee/{id}/salary	Update salary only
🔹 Folder Structure
Controller → API endpoints  
Service → Business logic  
Repository → DB operations (JPA)  
DTO → Data transfer  
Entity → Database model  

🔹 Purpose

A hands-on backend development project to practice:

REST API design

HTTP status codes

JPA/Hibernate

Layered architecture

Spring Boot development

<div align="center">
Minido 
 
**A clean, RESTful Task Management API built with Spring Boot**
 
![Java](https://img.shields.io/badge/Java-17+-b07219?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Status](https://img.shields.io/badge/status-completed-4c9f70?style=flat-square)
 
</div>

 
## About
 
Minido is a simple, focused REST API for managing everyday tasks — create them, track them, update them, and clear them out once they're done. It was built to practice professional Spring Boot conventions: layered architecture, clean domain modeling, and a well-defined API contract, all shaped around real user stories rather than arbitrary features.
 
## Features
 
- ✅ Create tasks with a title, description, due date, and priority
- 📄 List all existing tasks
- ✏️ Update task details and status
- 🗑️ Delete tasks that are no longer needed
## Tech Stack
 
| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Build Tool | Apache Maven |
| Persistence | Spring Data JPA |
 
## Architecture
 
The application follows a standard layered architecture, keeping concerns cleanly separated:
 
```
Controller Layer   →  exposes the REST API
Service Layer      →  business logic & interfaces
Repository Layer   →  JPA-based persistence
DTOs & Mappers     →  decouple internal entities from the public API
```
 
The core domain is the `Task` entity, with `TaskStatus` (open / complete) and `TaskPriority` (high / medium / low) enums shaping its behavior.
 
## API Overview
 
| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/tasks` | Create a new task |
| `GET` | `/tasks` | List all tasks |
| `PUT` | `/tasks/{id}` | Update an existing task |
| `DELETE` | `/tasks/{id}` | Delete a task |
 
## Getting Started
 
**Prerequisites:** Java 17+, Maven 3.6+
 
```bash
git clone https://github.com/YoussefZahran2005/minido.git
cd minido
mvn spring-boot:run
```
 
Adjust `application.properties` if you'd like to point the app at your own database.
 
## Acknowledgments
 
This project follows the excellent Spring Boot tutorial on the **DevTiro** YouTube channel, which served as my mentor throughout — walking through user stories, layered architecture, and REST API design in a clear, professional way. That said, every line of code in this repository was written by me, following along and working through each concept in my own way.
 
---
 
<div align="center">
<sub>Built as a personal learning project · Feedback and suggestions are always welcome</sub>
</div>

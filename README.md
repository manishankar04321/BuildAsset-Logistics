# 🏗️ BuildAsset Logistics

**Construction Equipment Rental & Asset Dispatch System**

BuildAsset Logistics is a microservices-based application designed to simplify construction equipment rental, contractor management, rental bookings, and equipment dispatch tracking.

##  Features

- **Contractor Management** – Create, view, update, and delete contractor details.
- **Equipment Management** – Manage equipment information and availability.
- **Rental Management** – Handle rental bookings and calculate rental duration.
- **Dispatch Management** – Track equipment dispatch details and status.
- **JWT Authentication** – Secure user authentication.
- **API Gateway** – Centralized access to backend services.
- **Service Discovery** – Register and discover services using Eureka.
- **Separate Databases** – Maintain independent databases for individual services.

##  Technologies Used

- Java
- Spring Boot
- Spring Cloud
- Spring Cloud Gateway
- Netflix Eureka
- Spring Cloud LoadBalancer
- JWT Authentication
- MySQL
- Maven
- Postman

##  Architecture

The application follows a microservices architecture with the following components:

| Service | Responsibility |
|---|---|
| Auth Service | Authentication and JWT |
| Contractor Service | Contractor management |
| Equipment Service | Equipment management |
| Rental Service | Rental bookings |
| Dispatch Service | Dispatch tracking |
| API Gateway | Request routing |
| Eureka Server | Service discovery |

Each business service maintains its own database to keep data logically separated.

## Getting Started

### Prerequisites

Install the following tools:

- Java JDK
- Maven
- MySQL Server
- Postman
- Spring Tool Suite (STS) or IntelliJ IDEA

##  Testing

REST API endpoints can be tested using Postman. Verify CRUD operations, rental booking functionality, dispatch status updates, and authentication responses.

## Project Objective

The main objective is to provide a centralized and organized system for managing construction equipment rentals and dispatch operations using modern backend technologies.

##  Future Enhancements

- Docker containerization
- AWS cloud deployment
- CI/CD pipeline integration
- Frontend integration
- Enhanced monitoring and logging

##  Team

Developed as part of the **PS048 – On-Demand Construction Equipment Rental & Asset Dispatch System** project at KL University.

##  Project Status

Currently under development and improvement.


**Built with Java, Spring Boot, and Microservices.**

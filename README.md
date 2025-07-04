# Hotel Rating Microservices Project

This project is built using a microservices architecture and demonstrates how different services can communicate and function together in a distributed system. The application is centered around a hotel rating platform and is divided into the following microservices:

Microservices
User Service – Handles user-related operations such as creating and retrieving users.
Hotel Service – Manages hotel data including hotel details and identifiers.
Rating Service – Manages the ratings given by users to hotels and links user and hotel data.

Core Components Implemented
Service Registry (Eureka Server) – For service discovery, enabling dynamic registration and lookup of services.
Feign Client – Simplifies inter-service communication by abstracting REST calls.
API Gateway (Spring Cloud Gateway) – Acts as a single entry point for all services and handles request routing.
Config Server – Centralized configuration server for managing external properties across services.
Circuit Breaker (Resilience4j) – Ensures fault tolerance and system stability during service failures.
Rate Limiter (Resilience4j) – Controls request traffic to protect services from being overloaded.
Includes JMeter test files for circuit breaker and rate limiter testing.

This setup demonstrates how to build and integrate scalable, fault-tolerant microservices using Spring Boot and Spring Cloud components.

# Java Spring Boot Server 

## Project Description

This project is a basic Java server application built using the Spring Boot framework. It provides a simple RESTful API with multiple endpoints demonstrating different HTTP response statuses (200, 404, 5xx). The application is containerized using Docker and is designed to be deployed on AWS Elastic Beanstalk, utilizing EC2 instances, load balancers, and autoscaling groups.


## Future Scope

The project skeleton will be expanded to set up a home network, integrating various network services and configurations. Future updates will include detailed implementations for managing and monitoring home network devices, providing enhanced security features, and enabling seamless connectivity and communication across all home network devices.

## Endpoints

The application provides the following endpoints:

- `/api/endpoint1` - Returns HTTP 200 status.
- `/api/endpoint2` - Returns HTTP 200 status.
- `/api/endpoint3` - Returns HTTP 200 status.
- `/api/endpoint4` - Returns HTTP 404 status.
- `/api/endpoint5` - Returns HTTP 5xx status.

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker
- AWS CLI
- Elastic Beanstalk CLI

### Setup

1. Clone the repository:

   ```sh
   git clone https://github.com/your-username/Java-springAPI-server.git
   cd Java-springAPI-server

   
Build the project
./mvnw clean package

Build the Docker image:
docker build -t java-server-demo .
Run the Docker container:

Run Docker Container
docker run -p 8080:8080 java-server-demo
Deploy to AWS Elastic Beanstalk:

Deploy on AWS Beanstalk
eb init
eb create java-server-demo-env
eb deploy

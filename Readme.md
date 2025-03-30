# Apache Kafka with Spring Boot

This repository demonstrates how to integrate Apache Kafka with Spring Boot. It covers Kafka producer, consumer, topic configuration, JSON serialization, and REST APIs for message publishing.

## Branches Structure

- **01-Initialization** - Setting up Kafka in a Spring Boot project.
    
- **02-Consumer-Producer-Configuration** - Configuring Kafka producer and consumer.
    
- **03-Kafka-Topic** - Creating and managing Kafka topics.
    
- **04-Kafka-Producer** - Implementing Kafka producers.
    
- **05-API-Send-Message** - Sending messages using REST APIs.
    
- **06-Kafka-Consumer** - Implementing Kafka consumers.
    
- **07-JSON-Serializer-Deserializer** - Handling JSON messages with Kafka.
    

## Prerequisites

- Java 17+
    
- Apache Kafka
    
- Spring Boot 3+
    
- Docker (optional for containerized setup)
    

## Installation & Setup

1. **Start Kafka** (if not running):
    
    ```sh
	bin\windows\kafka-server-start.bat config\server.properties
    ```
    
2. **Clone the repository:**
    
    ```sh
    git clone https://github.com/athrocks/Spring-Apache-Kafka.git
    cd Spring-Apache-Kafka
    ```
    
3. **Run the Spring Boot application:**
    
    ```sh
    mvn spring-boot:run
    ```
    

## REST APIs

### Send String Message

**Endpoint:**

```http
GET http://localhost:8080/api/v1/kafka/publish?message=hello%20world
```

**Response:**

```json
"Message sent to the Kafka topic"
```

### Send JSON Message

**Endpoint:**

```http
POST http://localhost:8080/api/v1/kafka/publish
```

**Request Body:**

```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe"
}
```

**Response:**

```json
"Json Message sent to the Kafka topic"
```

## User Model

```java
public class User {
    private int id;
    private String firstName;
    private String lastName;

    // Getters and Setters
}
```

## License

This project is open-source and available under the [MIT License](https://chatgpt.com/c/LICENSE).
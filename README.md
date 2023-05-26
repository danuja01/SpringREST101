# Employee Management API

This is a sample REST API project for managing employees using Spring, Spring Boot, JPA, and H2 in-memory database.

## Prerequisites

Make sure you have the following software installed on your machine:

- Java Development Kit (JDK) 8 or later
- Maven build tool

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-management-api.git
   ```

2. Navigate to the project directory:
   ```bash
   cd SpringREST101-JPA-H2
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   The application will start running on http://localhost:8080.

## API Endpoints

The following endpoints are available for managing employees:

- **GET /employees**: Retrieve a list of all employees.
- **GET /employees/{id}**: Retrieve a specific employee by ID.
- **POST /employees**: Create a new employee.
- **PUT /employees/{id}**: Update an existing employee.
- **DELETE /employees/{id}**: Delete an employee.

## Database

This project uses an H2 in-memory database. The database is automatically initialized with sample data on application startup. You can access the H2 console at `http://localhost:8080/h2-console` to view and interact with the database.

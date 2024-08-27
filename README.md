/**
 # Employee API Controller
 * This project contains a Spring Reactive CRUD application for managing employee details using the `EmployeeApiController` class. 
 * The controller is built using Spring WebFlux, which allows for non-blocking, reactive programming to handle asynchronous requests.
 
 ## Overview
 * The `EmployeeApiController` class provides RESTful endpoints for managing employees. 
 * It interacts with the `EmployeeService` to perform operations such as fetching, adding, deleting, and updating employee records. 
 * The controller supports reactive streams, enabling efficient handling of large datasets with minimal latency.
 
 ## Endpoints
 ### 1. Fetch All Employees
 - **Endpoint:** `GET /api/employees`
 - **Description:** Retrieves a stream of all employee details.
 - **Produces:** `text/event-stream`
 - **Response:** A `Flux<Employee>` stream containing all employees.
 
 ### 2. Add a New Employee
 - **Endpoint:** `POST /api/addemployee`
 - **Description:** Adds a new employee to the system.
 - **Request Body:** A JSON object representing the `Employee` to be added.
 - **Response:** A `Mono<Employee>` containing the added employee.
 
 ### 3. Delete an Employee
 - **Endpoint:** `DELETE /api/removeemployee/{id}`
 - **Description:** Deletes an employee by their `id`.
 - **Path Variable:** `id` - The ID of the employee to be deleted.
 - **Response:** A `Mono<Void>` indicating completion of the operation.
### 4. Fetch Employees with Age Greater Than 20
 - **Endpoint:** `GET /api/getAllEmployeeDetailsAgeGreater20`
 - **Description:** Retrieves a stream of employee details where the age is greater than 20.
 - **Produces:** `text/event-stream`
 - **Response:** A `Flux<Employee>` stream containing the filtered employees.
### 5. Update Employee Email
 - **Endpoint:** `PUT /api/updateEmployeeEmail/{id}/{emailId}`
 - **Description:** Updates the email address of an employee.
 - **Path Variables:**
 - `id` - The ID of the employee to update.
 - `emailId` - The new email address.
 - **Response:** A `Mono<Employee>` containing the updated employee.
## How It Works
 - **Reactive Programming:** The controller utilizes Spring WebFlux to create non-blocking, asynchronous RESTful endpoints. 
    - `Flux` represents a reactive sequence of 0 to N items.
    - `Mono` represents a reactive sequence of 0 to 1 item.
 - **Streaming Data:** The `MediaType.TEXT_EVENT_STREAM_VALUE` allows streaming of data in real-time, making it ideal for applications that require continuous data updates.
 
## Getting Started
 
 1. **Clone the Repository:**  
     `git clone <repository-url>`
 
 2. **Build the Project:**  
      Navigate to the project directory and run:  
      `mvn clean install`
 
 3. **Run the Application:**  
      Use the following command to start the application:  
      `mvn spring-boot:run`
 
 4. **Test the Endpoints:**  
      Use tools like Postman or cURL to test

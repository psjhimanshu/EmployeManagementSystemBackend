Employee Management System
Description

The Employee Management System (EMS) is a full-stack web application designed to manage employee records efficiently. It allows users to perform various operations such as:

CRUD Operations: Create, Read, Update, and Delete employee records.

Search Functionality: Find employees based on criteria like name, department, and designation.

Validation: Ensures proper data entry through frontend validation and backend checks.

This system uses Spring Boot for the backend and React for the frontend, offering a seamless user experience for managing employee data.

Features

Create: Add new employee details like name, designation, department, salary, etc.

Read: View all employee records in a list.

Update: Edit employee details as needed.

Delete: Remove an employee record.

Search: Find employees quickly using search filters.

Validation: Ensures all required fields are valid before submission (e.g., name, email, salary).

Tech Stack

Frontend: React.js

Backend: Spring Boot (Java)

Database: MySQL / PostgreSQL / MongoDB (depending on your choice)

Libraries/Tools:

React Router (for routing)

Axios (for making API requests)

Spring Data JPA / Hibernate (for ORM)

Bootstrap or Material UI (for frontend styling)

Installation

Follow these steps to set up the project locally.

Prerequisites

Ensure the following are installed:

Java (JDK 11 or later)

Maven (for building the Spring Boot backend)

Node.js and npm (for managing frontend dependencies)

MySQL or any other database system you prefer.

Backend Setup (Spring Boot)

Clone the repository:

git clone https://github.com/psjhimanshu/EmployeManagementSystemBackend


Navigate to the backend directory:

cd EmployeManagementSystemBackend


Install dependencies:

mvn install


Configure the database connection in src/main/resources/application.properties or application.yml file:

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=sqlpassword
spring.jpa.hibernate.ddl-auto=update


Run the Spring Boot application:

mvn spring-boot:run


Your backend will be running on http://localhost:8080.

Frontend Setup (React)

Navigate to the frontend directory:

cd EmployeManagementSystemFrontend


Install necessary dependencies:

npm install


Modify API endpoints in the frontend to point to your backend (if necessary). By default, the React app will communicate with the backend running at http://localhost:8080.

Run the React application:

npm start


Your frontend will be running on http://localhost:3000.

Usage

Adding a New Employee: Go to the "Add Employee" section in the frontend, enter the employee details, and submit the form to add a new employee.

Viewing Employees: Employees will be listed on the dashboard, where you can see all their details.

Updating Employee Info: Click the "Edit" button next to any employee's record to update their details.

Deleting an Employee: Click the "Delete" button next to any employee to remove them from the system.

Search Employees: Use the search bar to filter employees by name, department, or other criteria.

Validation

Frontend Validation: Ensures the data entered is valid (e.g., fields like name, salary, email are required, email follows a valid pattern).

Backend Validation: Ensures that no invalid data can be submitted through the API.

Contributing

If you'd like to contribute to the project:

Fork the repository.

Create a new branch:

git checkout -b feature-branch


Make your changes and commit them:

git commit -m 'Add new feature'


Push the changes to your forked repository:

git push origin feature-branch


Create a pull request to merge your changes.

License

This project is licensed under the MIT License - see the LICENSE
 file for details.

Acknowledgements

Spring Boot
 for building the backend.

React
 for the frontend framework.

MySQL
 or other database used for storing employee data.

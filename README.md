# Project Name
University Event Management

# Frameworks and Language Used
**Spring Boot** 2.1.0
**Java** 11
**Maven** 3.8.1

# Data Flow
The following functions are used in the data flow of this project:

_**Controller:**_ 

**StudentController:**

POST "/univ/student/add": adds one or more students to the database
PUT "/univ/student/update/department/{department}/id/{id}": updates the department of a student with a specified id
DELETE "/univ/student/delete/id/{id}": deletes a student with a specified id
GET "/univ/student/all": retrieves all students from the database
GET "/univ/student/id/{id}": retrieves a student with a specified id


**EventController:**

POST "/univ/event/add": adds one or more events to the database
PUT "/univ/event/update/location/{location}/id/{id}": updates the location of an event with a specified id
DELETE "/univ/event/delete/id/{id}": deletes an event with a specified id
GET "/univ/event/all": retrieves all events from the database



_**Services**:_ 

The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

The code includes two main controllers, "StudentController" and "EventController", and two corresponding services, "StudentService" and "EventService". The "StudentController" includes endpoints for adding, updating, deleting, and retrieving students by ID. The "EventController" includes endpoints for adding, updating, deleting, and retrieving events. Both services implement the necessary CRUD (Create, Read, Update, Delete) operations and communicate with the corresponding repositories, "IStudentRepository" and "IEventRepository". The services perform the necessary operations on the model objects "Student" and "Event".

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.


# Database Structure Used
I have used H2 as DataBase

# Project Summary

In this project i have create different endpoints like and used differet vaalidation for the end ponits




# Student Management System

A console-based Java application for managing student records through a simple CRUD workflow.

## Features
- Add student records
- View all students
- Search students by ID
- Update student details
- Delete student records
- Duplicate-ID validation
- Basic input validation and error handling

## Tech Stack
- **Language:** Java
- **Core Concepts:** OOP, classes, encapsulation, ArrayList, methods, exception handling
- **Interface:** Console / CLI

## Project Structure

```text
Student-Management-System/
├── src/
│   └── StudentManagementSystem.java
├── README.md
└── .gitignore
```

## How to Run

From the project root:

```bash
javac -d out src/StudentManagementSystem.java
java -cp out StudentManagementSystem
```

## Application Flow

```text
Start
  ↓
Display Menu
  ↓
Add / View / Search / Update / Delete
  ↓
Process Student Record
  ↓
Return to Menu
  ↓
Exit
```

## OOP Concepts Demonstrated
- **Class and Object:** Student records are represented using a dedicated Student class.
- **Encapsulation:** Student fields are private and accessed through methods.
- **Abstraction through methods:** CRUD operations are separated into focused methods.
- **Collections:** ArrayList is used to maintain student records dynamically.
- **Exception Handling:** Invalid numeric input is handled safely.

## Future Enhancements
- Database integration using JDBC/MySQL
- Login and role-based access
- GUI using JavaFX or Swing
- REST API backend
- Unit testing with JUnit
- Persistent student records

## Author

**UBAID UL NAFEY MOHAMMED**

This project is developed as a Java/OOP portfolio project to demonstrate practical programming and application-development skills.
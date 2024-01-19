# petcare
# Pet Care Web Application

## Overview

The Pet Care Web Application is a project developed using Spring Boot, Spring Data JPA, and MySQL to facilitate pet adoption. The application allows users to view and adopt pets such as dogs, cats, birds, pigs, and calves. Pets are stored in a MySQL database, and the application provides basic CRUD (Create, Read, Update, Delete) operations.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)

## Features

- View a list of available pets.
- Adopt pets based on their type (dog, cat, bird, pig, calf).
- Perform CRUD operations on pets.

## Getting Started

### Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK)
- MySQL Database

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/petcare.git
   cd petcare
2. Configure the database:

   - Open `src/main/resources/application.properties`.
   - Update the database URL, username, and password according to your MySQL configuration.

 3. Build and run the application:
     ```bash
    ./mvnw spring-boot:run
     
   - The application will be accessible at http://localhost:8080.

## Usage
- Access the Pet Care application through a web browser or API client.
- Use the provided endpoints to view, adopt, and manage pets.

## Endpoints
- GET /pets: Retrieve a list of all pets.
- GET /pets/{id}: Retrieve information about a specific pet.
- POST /pets: Adopt a new pet. Send a JSON payload with the pet type.
- DELETE /pets/{id}: Remove a pet based on its ID.

## Contributing
Contributions are welcome! Please follow the Contributing Guidelines.


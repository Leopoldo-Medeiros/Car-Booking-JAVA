# Car Booking CLI System

A simple command-line interface (CLI) application for booking cars, built in Java. This project serves as a practical exercise in core Java concepts, object-oriented programming, and layered application architecture.

## Features

As an admin user, you can perform the following operations:

- **1️⃣ - Book Car**: Book an available car for a registered user.
- **2️⃣ - View All User Booked Cars**: See a list of all cars booked by a specific user.
- **3️⃣ - View All Bookings**: Get a complete list of all bookings made in the system.
- **4️⃣ - View Available Cars**: See all cars that are currently not booked.
- **5️⃣ - View Available Electric Cars**: Filter the available cars to see only the electric models.
- **6️⃣ - View all users**: Display a list of all registered users in the system.
- **7️⃣ - Exit**: Close the application.

## Project Structure

The application is designed using a layered architecture to separate concerns and improve maintainability.

1.  **CLI (Command-Line Interface)**
    -   **Package**: `com.cli`
    -   **Responsibility**: This is the user-facing layer, responsible for displaying menus, handling user input, and printing output to the console.

2.  **Service Layer**
    -   **Packages**: `com.booking`, `com.car`, `com.user`
    -   **Responsibility**: Contains the core business logic of the application. It orchestrates operations by coordinating the DAOs to fulfill requests from the CLI. For example, the `BookingService` contains the logic to validate and create a new car booking.

3.  **DAO (Data Access Object) Layer**
    -   **Packages**: `com.booking`, `com.car`, `com.user`
    -   **Responsibility**: This layer is responsible for data persistence and retrieval. It abstracts the data source from the rest of the application. In this implementation, the DAOs manage in-memory static arrays.

4.  **POJO (Plain Old Java Object) Layer**
    -   **Packages**: `com.booking`, `com.car`, `com.user`
    -   **Responsibility**: These are the fundamental data models that represent the entities of the system (`User`, `Car`, `Booking`). They primarily hold data and contain getters, setters, and standard object methods (`equals()`, `hashCode()`, `toString()`).

## Data Model

*   **`User.java`**: Represents a user with a unique `id` and a `name`.
*   **`Car.java`**: Represents a car with properties like `id`, `regNumber`, `brand`, `price`, and its current availability status (`isAvailable`).
*   **`Brand.java`**: An `enum` to ensure type-safe representation of car brands.
*   **`Booking.java`**: Represents a link between a `User` and a `Car`, containing a unique booking `id` and a timestamp.

## Technologies & Constraints

This project was developed with a specific set of constraints to focus on core Java fundamentals.

- **Language**: Java 17
- **Data Storage**: In-memory static arrays.

### Imposed Constraints:
- No dependency management (Maven, Gradle).
- No dependency injection frameworks (Spring).
- No use of Java Streams or Interfaces (in the initial implementation).
- No unit testing frameworks.

## How to Run the Application

### Prerequisites
- Java Development Kit (JDK) 17 or higher must be installed.
- A terminal or command prompt.

### Steps

1.  **Navigate to the Source Directory**:
    Open your terminal and navigate to the `src` folder within the project directory.
    ```sh
    cd /path/to/your/project/Car-Booking-JAVA/src
    ```

2.  **Compile the Java Files**:
    Compile all the `.java` files into `.class` files. The `-d .` flag places the compiled classes into packages that mirror the source structure.
    ```sh
    javac -d . com/cli/Main.java com/user/*.java com/car/*.java com/booking/*.java
    ```
    *(Note: Depending on your shell, you might need to specify each file individually if wildcards don't work as expected).*

3.  **Run the Application**:
    From the `src` directory, run the `main` method in the `Main` class.
    ```sh
    java com.cli.Main
    ```

4.  **Interact with the System**:
    The car booking menu will appear in your terminal. Follow the on-screen prompts to use the application.
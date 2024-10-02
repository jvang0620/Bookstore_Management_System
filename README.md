# Bookstore Management System

## Overview

The **Bookstore Management System** is a Java-based application designed to simulate and handle bookstore operations, such as managing inventory, tracking membership details, handling pricing and purchase transactions, and providing product information. This project demonstrates object-oriented programming concepts and interactions between various bookstore-related components.

## Features

- **Inventory Management**: Manages a list of products including Books, CDs, and DVDs, along with their details like title, author, and price.

- **Membership System**: Differentiates between Regular Members and Premium Members, tracking information such as membership ID, payment methods, and membership fees.

- **Pricing and Purchase Management**: Maintains pricing information for different items and facilitates purchase transactions, updating total spending and item quantities.

- **User Interaction**: Uses the `Scanner` class to receive input from users, enabling operations such as adding or purchasing items.

- **Object-Oriented Design**: Utilizes inheritance and encapsulation principles with classes such as `Members`, `RegularMembers`, `PremiumMembers`, and `Product`.

## Prerequisites

- Java 8 or higher
- An IDE such as Eclipse or IntelliJ, or a text editor like VS Code
- Command-line access for running the application

## Getting Started

1. **Clone the Repository**: Download or clone the project to your local machine.

   ```bash
   git clone <repository_url>
   ```

2. **Compile the Java files**:

   Open your terminal or command prompt and navigate to the project directory. Compile the Java files using:

   ```bash
   javac src/TestHarness.java
   ```

3. **Run the Application**:

   Execute the compiled class file to run the bookstore management system:

   ```bash
   java src.TestHarness
   ```

## Project Structure

The project consists of multiple classes that interact to provide the desired functionality:

- `TestHarness.java`: The main entry point for the application, which creates and manages instances of various components like `BookStoreInventory` and `PricingAndPurchase`.

- `Members.java`: Abstract class representing a general member, serving as the parent class for `RegularMembers` and `PremiumMembers`.

- `RegularMembers.java`: Manages the details and functionality specific to regular bookstore members, such as tracking membership type and payment method.

- `PremiumMembers.java`: Represents premium bookstore members, handling additional attributes like premium membership status, monthly fee payments, and fee status.

- `Product.java`: Abstract class serving as the parent for `Books`, `CDs`, and `DVDs`, providing attributes like item name, author, product ID, and price.

- `BookStoreInventory.java`: Manages the inventory of products available in the bookstore, including operations to add, remove, and display inventory items.

- `PricingAndPurchase.java`: Handles all pricing-related logic and calculations, and keeps track of purchase totals for various products.

## Usage

The application will prompt the user to enter commands to interact with the bookstore system. Below is a brief overview of how to use the system:

1. **Viewing Inventory**: Displays the current list of books available.

2. **Adding a Book**: Allows the user to add a new book by entering its title, author, price, and other details.

3. **Purchasing a Book**: Facilitates purchasing a book and updates inventory and financial details.

4. **Updating Prices**: The application allows for updating the price of products individually or in bulk.

5. **Managing Memberships**: Handles membership registration, fee payments, and premium membership upgrades.

## Future Enhancements

The project can be further enhanced by adding the following features:

- **Graphical User Interface (GUI)**: Implement a user-friendly GUI to replace the command-line interface.

- **Database Integration**: Store and retrieve inventory and membership data using a relational database such as MySQL or SQLite.

- **Reporting Features**: Generate detailed reports on inventory, sales, and membership statuses.

## Author

**Jai Vang** - Developer and Author of this project.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

# E-Commerce Backend Application

Welcome to the E-Commerce Backend Application. This project is a Spring Boot application that provides RESTful APIs for
an e-commerce platform, including user authentication, product management, shopping cart, orders, and payments.

## Table of Contents

- [Features](#features)
- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Features

- User Registration and Authentication
- Product Management
- Shopping Cart Functionality
- Order Processing
- Payment Integration
- Coupon Management
- Analytics

## Architecture

The application is built using the following technologies:

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Security
- MapStruct
- Lombok
- Maven

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL (or another supported database)

## Installation

1. **Clone the repository:**

   ```
   git clone https://github.com/yourusername/ecommerce-backend.git
   cd ecommerce-backend
   ```

2. **Configure the database:**

   Update the `application.properties` file with your database settings:

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   ```

3. **Install dependencies and build the project:**

   ```
   mvn clean install
   ```

4. **Run the application:**

   ```
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## Usage

You can use tools like Postman or cURL to interact with the API endpoints.

## API Endpoints

### Authentication

- `POST /api/auth/signup` - Register a new user
- `POST /api/auth/login` - Authenticate a user and retrieve a JWT token
- `POST /api/auth/logout` - Logout the user
- `POST /api/auth/refresh-token` - Refresh JWT token
- `GET /api/auth/profile` - Get the authenticated user's profile

### Products

- `GET /api/products/` - Get all products (Admin only)
- `GET /api/products/featured` - Get featured products
- `GET /api/products/category/{category}` - Get products by category
- `GET /api/products/recommendations` - Get recommended products
- `POST /api/products/` - Create a new product (Admin only)
- `PATCH /api/products/{id}` - Toggle featured status of a product (Admin only)
- `DELETE /api/products/{id}` - Delete a product (Admin only)

### Cart

- `GET /api/cart/` - Get the user's cart
- `POST /api/cart/` - Add an item to the cart
- `DELETE /api/cart/` - Remove all items from the cart
- `PUT /api/cart/{id}` - Update the quantity of a cart item

### Coupons

- `GET /api/coupons/` - Get available coupons
- `POST /api/coupons/validate` - Validate a coupon code

### Payments

- `POST /api/payments/create-checkout-session` - Create a new checkout session
- `POST /api/payments/checkout-success` - Handle successful checkout

### Analytics

- `GET /api/analytics/` - Get analytics data (Admin only)

## Testing

Unit tests are written using JUnit 5 and Mockito. To run tests:

```
mvn test
```

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any improvements or bug fixes.

## License

This project is licensed under the MIT License.

---

**Note:** Replace placeholders like `yourusername` and database credentials with your actual information.

---

If you have any questions or need further assistance, feel free to contact me!
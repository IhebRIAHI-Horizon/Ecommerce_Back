# Ecommerce Project

This full-stack ecommerce application was developed by Iheb Riahi using Angular and Spring Boot.
Although some features are not yet implemented or fully functional, the application serves as a small project completed as part of the Angular curriculum at Horizon School University.

## Ecommerce_Back
This Github repository hosts the backend code for my 'Ecommerce Project', which was built using Spring Boot 3.0.2 and authored by Iheb Riahi.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17
- Spring Boot 3.0.2
- Lombok  (https://projectlombok.org/setup/eclipse)

### Installing

1. Clone the repository to your local machine

$ git clone https://github.com/IhebRIAHI-Horizon/Ecommerce_Back.git

2. Navigate and start the backend server (port 8090 is used -> localhost:8090)

$ mvn spring-boot:run

DON'T FORGET TO CHANGE YOUR MYSQL CREDENTIALS IN APPLICATION.PROPERTIES FILE

## Overview

### Features

1. Home Page: Displaying new added products (last 6/ last 15)
2. Products: List products with filters (gender, color, price...etc) and pagination with fixed size 6
3. Cart: Add , edit quantity and delete products from the cart.
4. Admin Dashboard: Charts(static for now), Edit products page: CRUD operations
5. Login page: Admins only can login for now

Minor features: scroll to top, navbar, sidebar, snackbar, products list dynamically refresh after isertion/deletion/update

### Notes

1. If you run the frontend on a different port instead of 4200, you need to change the 'allowedOrigins("http://localhost:4200")' in WebConfig.java

### Preview

1. User Interface : https://www.loom.com/share/99d6bd4f29e0408bafe40a8800bb8442
2. Admin Interface : https://www.loom.com/share/709141d3c5864815ade6e66b98e35435

## Contributing

Feel free to submit pull requests and open issues for any bugs or feature requests.

## Contact

LinkedIn : https://www.linkedin.com/in/ihebriahi

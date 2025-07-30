# 🚗 Garage Billing System (Java + JDBC + MySQL)

A simple Java console project to manage a car garage's operations, including customer details, vehicles, services, and billing. Built with JDBC and MySQL.

---

## 📌 Features
- Add customers and link their vehicles
- Manage garage services and pricing
- Generate invoices with customer, vehicle, and service info
- View all invoices (date/time auto-generated)

---

## 🛠️ Tech Stack
- Java 22
- JDBC (MySQL Connector 8.0.30)
- MySQL 8.x
- IntelliJ IDEA (Community Edition)

---

## 🗂️ Folder Structure

src/
├── config/
│ └── DbConfig.java
├── entity/
│ ├── Customer.java
│ ├── Vehicle.java
│ ├── Service.java
│ └── Invoice.java
├── service/
│ ├── CustomerService.java
│ ├── VehicleService.java
│ ├── ServiceService.java
│ └── InvoiceService.java
└── BillingApp.java

pgsql
Copy
Edit

---

## 🧾 Database Tables

```sql
CREATE DATABASE Garage;

CREATE TABLE customers (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30),
  phone VARCHAR(15)
);

CREATE TABLE vehicles (
  id INT AUTO_INCREMENT PRIMARY KEY,
  customer_id INT,
  number_plate VARCHAR(15),
  model VARCHAR(10),
  FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
);

CREATE TABLE services (
  id INT AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(40),
  cost DOUBLE
);

CREATE TABLE invoices (
  id INT AUTO_INCREMENT PRIMARY KEY,
  customer_id INT,
  vehicle_id INT,
  service_id INT,
  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (customer_id) REFERENCES customers(id),
  FOREIGN KEY (vehicle_id) REFERENCES vehicles(id),
  FOREIGN KEY (service_id) REFERENCES services(id)
);
✅ Sample service data:

sql
Copy
Edit
INSERT INTO services (description, cost) VALUES
('Oil Change', 1200.00),
('Full Service', 3500.00),
('AC Repair', 2000.00),
('Battery Replacement', 4500.00),
('Tyre Replacement', 3200.00),
('Brake Inspection', 800.00),
('Engine Diagnostics', 2500.00),
('Car Wash', 500.00);
🚀 How to Run
Create the database and tables using the SQL above.

Set your MySQL credentials in DbConfig.java.

Compile and run BillingApp.java.

Interact via the console!

👨‍💻 Developed by
Abhinash Gond
Java Developer | Spark 4.0 Batch
📩 Feel free to connect on LinkedIn

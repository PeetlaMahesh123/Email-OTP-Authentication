## Email-OTP Authentication Project

The user must enter the OTP within a specific time limit to gain access to the application.


This project demonstrates **secure authentication workflows, email integration, and database operations** in a Spring Boot application.



---
## 📸 Application Screenshots
<p align="center">
  <img src="https://github.com/user-attachments/assets/bfae9f59-d559-4fcb-94c4-b6487f4492f2" width="320" height="240"/>
   <img src="https://github.com/user-attachments/assets/9d386841-190c-419d-bf16-29871a293079" width="320" height="240"/>
 
</p>

<p align="center">
    
  <img src="https://github.com/user-attachments/assets/fa6cd3ba-b7b4-43d2-b325-58e4fc570fd2" width="320" height="240"/>
  <img src="https://github.com/user-attachments/assets/1403e0ae-19b3-41a5-8617-3aa7e70d0e5b" width="320" height="240"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/06e436ff-d2d7-44f7-8b29-ae325b7171c5" width="320" height="240"/>
</p>

---

## 🚀 Features


---

## 🛠️ Tech Stack

**Backend**

* Java
* Spring Boot
* Spring Data JPA
* Hibernate

**Database**

* MySQL

**Email Service**

* Java Mail Sender

**Frontend**

* HTML
* CSS

---

## 📁 Project Structure

```
src
├── controllers
│   └── UserController.java
│
├── entities
│   ├── User.java
│   └── UserOtp.java
│
├── repositories
│   ├── UserRepository.java
│   └── UserOTPRepository.java
│
├── services
│   └── UserService.java
│
├── resources
│   └── templates
│       ├── index.html
│       ├── login.html
│       ├── otp.html
│       ├── homepage.html
│       └── loginFail.html
│
└── application.properties
```


---

## ⚙️ Application Workflow

---
1️⃣ User opens the application.
2️⃣ User registers with name, phone, email, and password.
3️⃣ User logs in using email and password.
4️⃣ System generates a **random OTP**.
5️⃣ OTP is sent to the user’s registered email.
6️⃣ User enters the OTP.
7️⃣ System verifies OTP validity and expiration time.
8️⃣ If OTP is correct → User redirected to homepage.

---

## ⚡ Configuration

---
Update `application.properties` with your database and email credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/springotpdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_APP_PASSWORD

---

## ▶️ How to Run the Project

1. Clone the repository

git clone https://github.com/PeetlaMahesh123/Email-OTP-Authentication.git

2. Open the project in your IDE

Recommended IDE: **Spring Tool Suite / IntelliJ / Eclipse**

3. Create MySQL database

CREATE DATABASE springotpdb;

4. Run the Spring Boot application

5. Open the browser

http://localhost:9090

---

## 📸 Screens (Application Pages)

* Registration Page
* Login Page
* OTP Verification Page
* Homepage

---

## 📚 Learning Outcomes

* Spring Boot MVC Architecture
* JPA/Hibernate Database Operations
* Email Integration using Java Mail Sender
* OTP Generation and Validation
* Secure Authentication Workflow

---

## 👨‍💻 Author

**Peetla Mahesh**

---


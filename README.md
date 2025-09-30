# 🌐 CollaborateSpace: Full-Stack Project & Skill Collaboration Platform

## 💡 Project Introduction
CollaborateSpace is a dynamic web application built for the modern creator economy. It serves as an integrated platform where developers and designers can showcase their technical skills and seamlessly manage collaborative software projects. The core mission is to empower individual contributors to connect with peers who share the same or complementary tech stacks, making it easy to form teams and execute complex projects with built-in tools for communication and task management.

## ✨ Key Features
CollaborateSpace provides a complete collaboration and project management suite:

### 1. Skill Showcase & Networking
1.1.Skill Showcase: Users create detailed profiles to highlight their expertise and specific tech stack.
1.2.Peer Discovery: Easily connect with and discover other users with complementary or shared technical backgrounds.
1.3.Collaboration Requests: Users can send formal requests to individuals to join a project, with notifications handled via Spring Starter Mail.

### 2. Project Management & Team Workflow
2.1.Project Uploads: Users can upload, host, and manage their personal or team projects.
2.2.Request Management: Users can send and receive requests to collaborate on a project, managed entirely by the project lead.
2.3.Private Project Chat: Every project includes a dedicated, personal chatbox for real-time communication among project group members.
2.4.Issue Tracking: A dedicated issue section allows users to report bugs or suggest features.
2.5.Task Assignment: Team leads can review issues and assign specific tasks directly to any group member.

## 🛠️ Technology Stack
CollaborateSpace is built as a robust, enterprise-grade full-stack application.

### Frontend:
1.React.js, HTML, CSS, JavaScript. (Intuitive UI built as a Single Page Application (SPA).)
2.Axios. (Efficiently manages asynchronous HTTP requests to the backend.)

### Backend: 
1.Java / Spring Boot. (Core business logic and production-ready RESTful APIs)
2.Spring JPA. (Object-Relational Mapping (ORM) for efficient database interaction)
3.Spring Security / JWT. (Robust authentication, authorization, and secure endpoint access)

### Database:
1.MySQL. (Reliable, structured data storage)

### Tools:
1.Docker / Docker Compose. (Containerization)
2.Jenkins. (Declarative pipeline included in the Deploy branch for automated cloud deployment (e.g., AWS))
3.Postman. (Recommended tool for testing the RESTful endpoints exposed by the Spring Boot backend).

## ⚙️ User Manual (Local Deployment)
The entire application is deployed using Docker Compose, making the setup simple and hassle-free.

### Prerequisites
You must have Docker Desktop installed and running on your system.

### Deployment Steps

1. Clone the repository: Open your terminal or command prompt and clone the project:
```bash
git clone https://github.com/dhruv-dosh/CollaborateSpace.git
cd CollaborateSpace
```
2. Start the Full Stack: Execute this single command. 
It builds the necessary Docker images for the Frontend, Backend, and MySQL database, then starts them all in detached mode (-d):
```bash
docker-compose up --build -d
```
(Wait for all services to initialize. The Spring Boot backend and the database may take a minute or two to fully start.)

3. Access the Application: Once the command completes, the web application is accessible via the frontend port:
Web App (Frontend): http://localhost:5173
REST API (Backend): http://localhost:5054

4. Stopping the Application
To stop and remove the running containers and the network:

```bash
docker-compose down
```
 *for more docker commands click [Docker_Notes](https://github.com/dhruv-dosh/Docker)*
 *Created and maintained by [dhruv-dosh](https://github.com/dhruv-dosh)*

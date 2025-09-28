# Angular + Spring Boot Demo

This project is a simple **full-stack demo** combining an Angular frontend with a Spring Boot backend. It shows how the two parts can communicate over REST APIs.

---

## 📂 Project Structure

```
SpringBoot_Angular/
│
├── taskbackend/        # Spring Boot backend (Java)
│   └── src/...         # REST API under /api/tasks
│
└── taskfrontend/       # Angular frontend (TypeScript)
    └── src/...         # Fetches tasks from backend
```

---

## 🚀 Backend (Spring Boot)

* Framework: **Spring Boot 3**
* Runs on: `http://localhost:8080`
* API Endpoint: `GET /api/tasks`
* Example Response:

```json
[
  { "id": 1, "title": "Learn Angular", "completed": false },
  { "id": 2, "title": "Learn Spring Boot", "completed": true }
]
```

### Run Backend

```bash
cd taskbackend
./mvnw spring-boot:run
```

---

## 💻 Frontend (Angular)

* Framework: **Angular**
* Runs on: `http://localhost:4200`
* Fetches tasks from Spring Boot backend.

### Run Frontend

```bash
cd taskfrontend
ng serve
```

---

## 🔗 How They Connect

* Angular makes HTTP requests to Spring Boot’s REST API.
* CORS is enabled in the backend with:

```java
@CrossOrigin(origins = "http://localhost:4200")
```

---

## 📌 Git Commands

First-time setup:

```bash
git init
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPO.git
git add .
git commit -m "Initial commit"
git branch -M main
git push -u origin main
```

Update & sync later:

```bash
git add .
git commit -m "Update"
git push
```

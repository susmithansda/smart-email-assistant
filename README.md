# 🤖 Smart Email Assistant

Smart Email Assistant is an AI-powered web application that helps users generate email replies quickly and easily.

The application uses **Google Gemini AI** to generate contextual email responses. Users can enter an email message, select a reply tone, and get an AI-generated response.

---

## 🚀 Features

- Generate AI-powered email replies
- Uses Google Gemini AI
- Select different reply tones
- Simple and user-friendly interface
- React frontend
- Spring Boot backend
- REST API communication
- AI-generated contextual responses

---

## 🛠️ Technologies Used

### Frontend
- React
- JavaScript
- Vite
- HTML
- CSS

### Backend
- Java
- Spring Boot
- Spring AI
- REST API
- Maven

### AI
- Google Gemini API

### Tools
- IntelliJ IDEA
- VS Code
- Postman
- Git
- GitHub

---

## 📁 Project Structure

```text
smart-email-assistant
│
├── email-writer-react
│   └── React Frontend
│
├── email-writer-sb
│   └── Spring Boot Backend
│
└── README.md

⚙️ How It Works
1.The user enters an email message.
2.The user selects a reply tone.
3.The React frontend sends the request to the Spring Boot backend.
4.The backend processes the request.
5.Spring AI communicates with Google Gemini AI.
6.Gemini generates an email reply.
7.The generated reply is sent back to the frontend.
8.The user can view the AI-generated email response.

🏗️ Application Architecture
React Frontend
      │
      │ REST API
      ▼
Spring Boot Backend
      │
      │ Spring AI
      ▼
Google Gemini API
      │
      ▼
AI Generated Email Reply

💻 Installation and Setup
1. Clone the Repository
git clone https://github.com/susmithansda/smart-email-assistant.git

Go to the project folder:
cd smart-email-assistant

🔙 Backend Setup

Go to the backend folder:

cd email-writer-sb

Run the Spring Boot application.

Using IntelliJ IDEA

Open the email-writer-sb folder in IntelliJ IDEA and run the main Spring Boot application.

Using Maven

On Windows:

mvnw.cmd spring-boot:run

The backend will run on:

http://localhost:8080
🎨 Frontend Setup

Open a new terminal and go to the frontend folder:

cd email-writer-react

Install the required dependencies:

npm install

Start the React application:

npm run dev

The frontend will usually run on:

http://localhost:5173

If port 5173 is already in use, Vite may use another port such as:

http://localhost:5174

🔐 Gemini API Configuration

This project requires a Google Gemini API key.

Add your Gemini API key to your backend configuration.

Example:

spring.ai.google.genai.api-key=YOUR_GEMINI_API_KEY

⚠️ Important: Do not upload your real Gemini API key to GitHub.

📡 API Testing

The backend API can be tested using Postman.

The React frontend sends email information to the Spring Boot backend.

The backend communicates with Google Gemini AI and returns an AI-generated email reply.

🎯 Future Improvements
User authentication
Email history
More reply tones
Dark mode
Mobile responsive design
Save generated replies
Copy reply button
Email sending functionality
👩‍💻 Author

Susmitha

GitHub:
https://github.com/susmithansda

⭐ Support

If you like this project, please give it a ⭐ on GitHub.


### ⚠️ Important
Before uploading this README, make sure your **Gemini API key is not visible on GitHub**.

Also, your repository currently appears to contain some extra folders. For a clean professional GitHub project, we can next **organize your repository properly** so it contains only:

```text
email-writer-react
email-writer-sb
README.md
.gitignore

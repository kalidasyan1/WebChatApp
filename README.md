# 💬 WebSocket Chat App (Spring Boot)

This is a simple real-time chat application built with **Spring Boot**, **WebSocket**, and **HTML + JavaScript**. It allows users to send and receive messages instantly between connected browser clients.

---

## 🚀 Features

- Real-time, bidirectional messaging via WebSocket
- Multi-user broadcast support
- Send messages by clicking the button or pressing `Enter`
- Lightweight, front-end served from static HTML
- Easy to run — no database or backend logic beyond messaging

---

## 🏗️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring WebSocket**
- **HTML5 + JavaScript**
- **Maven**

---

## 📁 Project Structure

- `ChatApplication.java`: Spring Boot main class
- `WebSocketConfig.java`: Registers WebSocket handler endpoint (`/chat`)
- `ChatWebSocketHandler.java`: Handles broadcasting messages
- `static/index.html`: Frontend UI (chat window and input)

---

## 🧰 Prerequisites

- Java 17 or newer
- Maven 3.6 or newer

---

## ▶️ How to Run

1. Clone the repository
2. Run the app using `mvn spring-boot:run`
3. Open `http://localhost:8080` in one or more browser tabs
4. Type a message and press `Enter` to broadcast to all connected clients

---

## 🌐 WebSocket Details

- **Endpoint**: `ws://localhost:8080/chat`
- **Protocol**: Raw WebSocket (no STOMP or SockJS)
- **Message Format**: Plain text

---

## ❗ Limitations

- No message persistence
- No authentication or user tracking
- No chat rooms or private messaging

---

## 🧠 Potential Improvements

- Add usernames or session identifiers
- Store and retrieve chat history
- Integrate WebSocket STOMP for richer client-side subscriptions
- Add support for chat rooms

---

## 📜 License

MIT License — free to use, modify, and distribute.

---

## 👨‍💻 Author

Created by ChatGPT 4.1. Feel free to contribute or suggest improvements!

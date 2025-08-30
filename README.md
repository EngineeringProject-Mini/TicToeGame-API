# TictoeGame-API

This is a simple implemention of a Tic Tac Toe game that allows two players to play on a NxN board, alternating turns, and determines the winner or a draw.

---

## 🚀 Getting Started

### 1. Generate Project with Spring Initializr
1. Go to [Spring Initializr](https://start.spring.io/).
2. Fill in the details:
   - Project: Maven
   - Language: Java
   - Spring Boot Version: (latest stable, e.g., 3.x.x)
   - Group: elevatorsystem
   - Artifact: 
   - Name: elevatorsystem
   - Packaging: Jar
   - Java: 17 (or your installed version)
3. Add dependencies:
   - Spring Web
   - - Lombok
4. Click Generate, and extract the downloaded project.

---

### 2. Open in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Import the project by selecting the extracted folder.
3. Wait until Maven builds the project and dependencies are downloaded.

---

### 3. Run the Application
1. Locate the main class:  
   src/main/java/elevaorsystem.java
2. Right-click and select Run 'ElevarorststemApplication'.
3. The application will start on http://localhost:8080 by default.

---

### 4. Testing the APIs
You can use Postman or curl to test the APIs.  
For example:
- External Request:  
  POST http://localhost:8080/elevators/request?floor=5&direction=UP
- Internal Request (Cabin Call):
  POST http://localhost:8080/elevators/1/select?floor=10
- Shutdown system:  
  POST http://localhost:8080/elevators/shutdown

---

## 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Maven
- REST API

  Got it 👍
Here are the **TicTacToe REST API endpoints** prepared in a clean, interview-style manner with brief descriptions:

---

## 🎮 TicTacToe API Endpoints

### 1. **Create a New Game**

**POST** `/tictactoe/create`

* **Params**:

  * `player1Name` (String) → Name of Player 1 (assigned **X**)
  * `player2Name` (String) → Name of Player 2 (assigned **O**)
* **Description**: Initializes a new game with two players.
* **Response**:
  `"New game started: Alice (X) vs Bob (O)"`
<img width="1366" height="768" alt="Screenshot (383)" src="https://github.com/user-attachments/assets/508cfc95-81e4-41da-91f1-76eeb725ead5" />

---

### 2. **Make a Move**

**POST** `/tictactoe/move`

* **Params**:

  * `playerName` (String) → The player making the move
  * `row` (int) → Row position (0–2)
  * `col` (int) → Column position (0–2)
* **Description**: Places the player’s symbol (**X** or **O**) on the board.
* **Response**:
  `"Move applied successfully. Check console for board state."`
<img width="1366" height="768" alt="Screenshot (385)" src="https://github.com/user-attachments/assets/146049e4-a9dd-42a5-851c-e72705f7346f" />

---

### 3. **Print Current Board**

**GET** `/tictactoe/board`

* **Description**: Displays the current TicTacToe board (printed in console for now).
* **Response**:
  `"Board printed to console."`
<img width="1366" height="768" alt="Screenshot (386)" src="https://github.com/user-attachments/assets/c8636b72-d201-4263-b88e-ff5caa35eb9f" />

---

### 4. **View Scoreboard**

**GET** `/tictactoe/scoreboard`

* **Description**: Shows the game scoreboard with player wins/losses/draws (printed in console).
* **Response**:
  `"Scoreboard printed to console."`
<img width="1366" height="768" alt="Screenshot (384)" src="https://github.com/user-attachments/assets/93e50e2f-2eb1-4eff-90f5-7f2a40bc9936" />

---

# ⏰ Responsive Digital Clock (Java Swing)

A modern **Java Swing GUI application** that displays a real-time digital clock with **time, date, and day**, along with a **responsive UI that adjusts font size automatically when the window is resized**.

---

## ✨ Features

- 🕒 Live digital time (hours, minutes, seconds with AM/PM)
- 📅 Current date display (e.g., 16 May 2026)
- 📆 Current day display (e.g., Saturday)
- 📱 Fully responsive UI (font size adjusts with window size)
- 🎨 Stylish color combination UI
- ⚡ Updates every 1 second using `Swing Timer`

---

## 🖥️ Preview Layout

```
DIGITAL CLOCK
      10:45:30 PM

  16 May 2026
     Saturday
```

---

## 📁 Project Structure

```
com.mycompany.clock.java
│
├── MyWindow.java   → Main UI (JFrame, Labels, Layout, Timer)
└── ClockJava.java  → Main class (Program entry point)
```

---

## 🚀 How It Works

- Uses `javax.swing.JFrame` for window
- Uses `JLabel` to show time, date, and day
- Uses `SimpleDateFormat` to format current system time
- Uses `Swing Timer (1000ms)` to update every second
- Dynamically adjusts font size based on window width

---

## ▶️ How to Run

### 💻 Using NetBeans:
1. Open NetBeans IDE
2. Create a new Java Project
3. Copy package:  
   `com.mycompany.clock.java`
4. Paste both files:
   - `MyWindow.java`
   - `ClockJava.java`
5. Run `ClockJava.java`

---

### 💻 Using Terminal (Manual Compile):

```bash
javac com/mycompany/clock/java/*.java
java com.mycompany.clock.java.ClockJava
```

---

## ⚙️ Requirements

- Java JDK 8 or higher
- Any IDE (NetBeans / IntelliJ / Eclipse) or terminal

---

## 📌 Concepts Used

- Java Swing GUI
- JFrame, JPanel, JLabel
- BorderLayout
- Event Handling (ActionListener)
- Swing Timer
- Date & Time Formatting (`SimpleDateFormat`)
- Responsive UI scaling

---

## 🎨 Customization Ideas

You can improve this project by adding:

- 🌙 Dark/Light theme switch
- 🎵 Alarm system
- 🧭 Analog clock
- 🖼️ Background image
- ⏱️ Stopwatch or countdown timer

---

## 👨‍💻 Author

Made with ❤️ using Java Swing

---

## 📜 License

This project is free to use for learning and educational purposes.

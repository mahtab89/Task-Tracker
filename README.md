# 📝 Task Tracker (CLI App)

Task tracker is a project used to track and manage your tasks.This is a command line interface (CLI) to track what you need to do, what you have done, and what you are currently working on.

---

## 🚀 Features
- ➕ Add new tasks  
- 🗑️ Delete tasks  
- ✏️ Update existing tasks  
- 🚧 Mark tasks as **in-progress**  
- ✅ Mark tasks as **done**  
- 📋 List all tasks or filter by status (**todo**, **in-progress**, **done**)  
- 💾 Stores all data in `tasks.json`  
- 🕓 Automatically tracks `createdAt` and `updatedAt` timestamps  

---

## ⚙️ How to Run

### 1️⃣ Compile the files
Make sure Java is installed (Java 17+ recommended).  
Open the terminal in your project folder and run:

```bash
javac Main.java Task.java TaskManager.java
```

### 2️⃣ Run the app
```bash
java Main <command> [arguments]
```

---

## 🧩 Commands

| Command | Description | Example |
|----------|--------------|----------|
| `add "<description>"` | Add a new task | `java Main add "Buy groceries"` |
| `update <id> "<new description>"` | Update a task | `java Main update 1 "Buy groceries and cook dinner"` |
| `delete <id>` | Delete a task | `java Main delete 1` |
| `mark-in-progress <id>` | Mark as in progress | `java Main mark-in-progress 1` |
| `mark-done <id>` | Mark as done | `java Main mark-done 1` |
| `listAll` | List all tasks | `java Main listAll` |
| `listDone` | List done tasks | `java Main listDone` |
| `listTodo` | List todo tasks | `java Main listTodo` |
| `listInProgress` | List in-progress tasks | `java Main listInProgress` |

---

## 🗂 Example `tasks.json` File

```json
[
  {
    "id": "1",
    "description": "Buy groceries",
    "status": "done",
    "createdAt": "05:11;2025 16:23:00",
    "updatedAt": "05:11;2025 18:10:45"
  },
  {
    "id": "2",
    "description": "Finish Java project",
    "status": "in-progress",
    "createdAt": "05:11;2025 18:15:00",
    "updatedAt": "05:11;2025 18:30:00"
  }
]
```

---

## 🧠 Learning Goals
- Practice **file handling** and **JSON manipulation** in Java  
- Build a simple **CLI tool** with user input  
- Apply **OOP concepts** for data organization  
- Learn about **timestamps** and data persistence  

---

## 🔗 Project URL
https://roadmap.sh/projects/task-tracker

---

👨‍💻 **Author:** [@mahtab89](https://github.com/mahtab89)

# Task-Management
TaskMaster - Task Management System
TaskMaster is a simple task management system implemented in Java. It allows users to add tasks, mark tasks as completed, view all tasks, and view upcoming tasks based on their due dates.

Classes

Task Class
The Task class represents a single task in the task management system. It has the following attributes:

name: A string representing the name or description of the task.
dueDate: A string representing the due date of the task.
priority: A string representing the priority level of the task (e.g., High, Medium, Low).
completed: A boolean indicating whether the task has been completed.
The Task class provides the following methods:

Task(String name, String dueDate, String priority): Constructor to initialize a new task with the given name, due date, and priority.
markCompleted(): Method to mark the task as completed.
getName(): Method to get the name of the task.
getDueDate(): Method to get the due date of the task.
getPriority(): Method to get the priority of the task.
isCompleted(): Method to check if the task has been completed.

TaskManager Class
The TaskManager class manages a collection of tasks and provides methods to interact with them. It has the following attributes:

tasks: An ArrayList to store the list of tasks.
The TaskManager class provides the following methods:

TaskManager(): Constructor to initialize a new task manager with an empty list of tasks.
addTask(Task task): Method to add a new task to the task manager.
displayTasks(): Method to display all tasks in the task manager, including their name, due date, priority, and completion status.
completeTask(int taskIndex): Method to mark a task at the specified index as completed.
getUpcomingTasks(int numTasks): Method to retrieve the upcoming tasks based on their due dates. It returns a list of tasks with the specified number of upcoming tasks.

TaskMaster Class
The TaskMaster class contains the main method and serves as the entry point for the program. It creates an instance of TaskManager, adds example tasks, and provides a menu-driven interface for users to interact with the task management system via the console.

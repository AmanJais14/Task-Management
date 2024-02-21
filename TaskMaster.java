package TaskMgmt;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskMaster {


    static class Task {
        private String name;
        private String dueDate;
        private String priority;
        private boolean completed;

        public Task(String name, String dueDate, String priority) {
            this.name = name;
            this.dueDate = dueDate;
            this.priority = priority;
            this.completed = false;
        }

        public void markCompleted() {
            this.completed = true;
        }

        public String getName() {
            return name;
        }

        public String getDueDate() {
            return dueDate;
        }

        public String getPriority() {
            return priority;
        }

        public boolean isCompleted() {
            return completed;
        }
    }


        public static void main(String[] args) {
            TaskManager taskManager = new TaskManager();
            Scanner scanner = new Scanner(System.in);

            // Example tasks
            Task task1 = new Task("Finish work report", "2024-02-25", "High");
            Task task2 = new Task("Buy groceries", "2024-02-21", "Medium");
            Task task3 = new Task("Call mom", "2024-02-22", "Low");

            // Add tasks to the task manager
            taskManager.addTask(task1);
            taskManager.addTask(task2);
            taskManager.addTask(task3);

            while (true) {
                System.out.println("\nTaskMaster  - Menu:");
                System.out.println("1. View tasks");
                System.out.println("2. Complete task");
                System.out.println("3. View upcoming tasks");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        taskManager.displayTasks();
                        break;
                    case "2":
                        taskManager.displayTasks();
                        System.out.print("Enter the index of the task you completed: ");
                        int taskIndex = Integer.parseInt(scanner.nextLine());
                        taskManager.completeTask(taskIndex);
                        break;
                    case "3":
                        System.out.print("Enter the number of upcoming tasks to display: ");
                        int numTasks = Integer.parseInt(scanner.nextLine());
                        ArrayList<Task> upcomingTasks = taskManager.getUpcomingTasks(numTasks);
                        System.out.printf("%nUpcoming %d tasks:%n", numTasks);
                        for (Task task : upcomingTasks) {
                            System.out.printf("- %s (Due: %s)%n", task.getName(), task.getDueDate());
                        }
                        break;
                    case "4":
                        System.out.println("Exiting TaskMaster2. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

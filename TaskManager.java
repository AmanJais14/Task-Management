package TaskMgmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaskManager {
    private ArrayList<TaskMaster.Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(TaskMaster.Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                TaskMaster.Task task = tasks.get(i);
                String status = task.isCompleted() ? "Completed" : "Pending";
                System.out.printf("%d. %s - Due Date: %s, Priority: %s, Status: %s%n",
                        i + 1, task.getName(), task.getDueDate(), task.getPriority(), status);
            }
        }
    }
    public void completeTask(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            TaskMaster.Task task = tasks.get(taskIndex - 1);
            task.markCompleted();
            System.out.printf("Task '%s' marked as completed.%n", task.getName());
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public ArrayList<TaskMaster.Task> getUpcomingTasks(int numTasks) {
        Collections.sort(tasks, Comparator.comparing(TaskMaster.Task::getDueDate));
        return new ArrayList<>(tasks.subList(0, Math.min(numTasks, tasks.size())));
    }
}

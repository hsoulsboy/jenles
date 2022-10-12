package com.jenles;

import java.util.Scanner;

import com.jenles.database.*;

public class App 
{
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Task name: ");
    	String taskName = scanner.nextLine();
    	
    	System.out.println("Task description: ");
    	String taskDescription = scanner.nextLine();
    	
    	System.out.println("Task assignee: ");
    	String taskAssigneeName = scanner.nextLine();
    	scanner.close();
    	
    	Assignee taskAssignee = new Assignee(taskAssigneeName);
    	
        Task task = new Task(taskName, taskDescription, taskAssignee);
        
        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.getAssignee());
        System.out.println(task.getStatus());
        
        MySqlConnection conn = new MySqlConnection();
        conn.listTasks();
        
        System.out.println(conn.registerTask(taskName, taskDescription, taskAssigneeName, Status.Backlog));
    }
}
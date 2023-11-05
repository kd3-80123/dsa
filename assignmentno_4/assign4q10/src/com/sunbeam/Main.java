package com.sunbeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeLinkList employeeList = new EmployeeLinkList();
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Search employee by name");
            System.out.println("4. Delete employee by empid");
            System.out.println("5. Update salary of employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employeeList.addEmployee();
                    break;
                case 2:
                    employeeList.displayEmployees();
                    break;
                case 3:
                    employeeList.searchEmployee();
                    break;
                case 4:
                    employeeList.deleteEmployee();
                    break;
                case 5:
                    employeeList.updateSalary();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}


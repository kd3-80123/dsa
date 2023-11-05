package com.sunbeam;

import java.util.Scanner;

public class EmployeeLinkList {
	class Employee {
	    int empid;
	    String name;
	    float salary;
	    Employee next;

	    public Employee(int empid, String name, float salary) {
	        this.empid = empid;
	        this.name = name;
	        this.salary = salary;
	        this.next = null;
	    }
	}

	
	    Employee head;

	    public EmployeeLinkList() {
	        head = null;
	    }

	    public void addEmployee() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter employee id: ");
	        int empid = sc.nextInt();
	        System.out.print("Enter employee name: ");
	        String name = sc.next();
	        System.out.print("Enter employee salary: ");
	        float salary = sc.nextFloat();
	        Employee newEmployee = new Employee(empid, name, salary);
	        if (head == null) {
	            head = newEmployee;
	        } else {
	            Employee current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newEmployee;
	        }
	        System.out.println("Employee added successfully.");
	    }

	    public void displayEmployees() {
	        if (head == null) {
	            System.out.println("No employees found.");
	        } else {
	            Employee current = head;
	            System.out.println("Employee details:");
	            while (current != null) {
	                System.out.println("Employee id: " + current.empid);
	                System.out.println("Employee name: " + current.name);
	                System.out.println("Employee salary: " + current.salary);
	                current = current.next;
	            }
	        }
	    }

	    public void searchEmployee() {
	        if (head == null) {
	            System.out.println("No employees found.");
	        } else {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter employee name to search: ");
	            String name = sc.next();
	            Employee current = head;
	            boolean found = false;
	            while (current != null) {
	                if (current.name.equals(name)) {
	                    System.out.println("Employee found:");
	                    System.out.println("Employee id: " + current.empid);
	                    System.out.println("Employee name: " + current.name);
	                    System.out.println("Employee salary: " + current.salary);
	                    found = true;
	                    break;
	                }
	                current = current.next;
	            }
	            if (!found) {
	                System.out.println("Employee not found.");
	            }
	        }
	    }

	    public void deleteEmployee() {
	        if (head == null) {
	            System.out.println("No employees found.");
	        } else {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter employee id to delete: ");
	            int empid = sc.nextInt();
	            if (head.empid == empid) {
	                head = head.next;
	                System.out.println("Employee deleted successfully.");
	            } else {
	                Employee current = head;
	                Employee prev = null;
	                boolean found = false;
	                while (current != null) {
	                    if (current.empid == empid) {
	                        prev.next = current.next;
	                        System.out.println("Employee deleted successfully.");
	                        found = true;
	                        break;
	                    }
	                    prev = current;
	                    current = current.next;
	                }
	                if (!found) {
	                    System.out.println("Employee not found.");
	                }
	            }
	        }
	    }

	    public void updateSalary() {
	        if (head == null) {
	            System.out.println("No employees found.");
	        } else {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter employee id to update salary: ");
	            int empid = sc.nextInt();
	            Employee current = head;
	            boolean found = false;
	            while (current != null) {
	                if (current.empid == empid) {
	                    System.out.print("Enter new salary: ");
	                    float salary = sc.nextFloat();
	                    current.salary = salary;
	                    System.out.println("Salary updated successfully.");
	                    found = true;
	                    break;
	                }
	                current = current.next;
	            }
	            if (!found) {
	                System.out.println("Employee not found.");
	            }
	        }
	    }
	}



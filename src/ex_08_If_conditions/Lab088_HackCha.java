package ex_08_If_conditions;

import java.util.Scanner;

public class Lab088_HackCha {
    public static void main(String[] args) {
//       A: 90-100
//       B: 80-89
//       C: 70-79
//       D: 60-69
//       F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the obtain Marks :");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Enter Marks Between 0 and 100");
        } else
        {
            if (marks >= 90 && marks <= 100) {
                System.out.println("Student Grade is A and Marks is " + marks + " ");
            }
            else if (marks <= 89 && marks >= 80) {
                System.out.println("Student Grade is B and Marks is " + marks + " ");
            } else if (marks <= 79 && marks >= 70) {
                System.out.println("Student Grade is C and Marks is " + marks + " ");
            } else if (marks <= 69 && marks >= 60) {
                System.out.println("Student Grade is D and Marks is " + marks + " ");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("Student Grade is F Marks is " + marks + " ");
            }


        }
    }
}
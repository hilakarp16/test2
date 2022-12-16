package com.loli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter all your grades (separated by comma):");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] grades = line.split(",");
        int total = getTotal(grades);
        double average = (double) total/grades.length;
        System.out.println("The average is2: " + average);
    }

    private static int getTotal(String[] grades) {
        int result = 0;
        for(String grade : grades) {
            result += Integer.parseInt(grade);
        }
        return result;
    }
}

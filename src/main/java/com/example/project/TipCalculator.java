package com.example.project;

import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { 
        // You must use these variables in your calculations
        StringBuilder result = new StringBuilder();

        // https://stackoverflow.com/questions/12806278/double-decimal-formatting-in-java DDF in Java SF article
        // Calculate tip and costs

        double tip = cost * (percent / 100.0);
        double totalBill = cost + tip;
        double tipPerPerson = tip / people;
        double costPerPerson = cost / people;
        double finalCostPerPerson = totalBill / people;

        // Append the formatted results
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $").append(String.format("%.2f", cost)).append("\n");
        result.append("Total percentage: ").append(percent).append("%\n"); // These lines feel too long I need criticism on how to make this shorter
        result.append("Total tip: $").append(String.format("%.2f", tip)).append("\n");
        result.append("Total Bill with tip: $").append(String.format("%.2f", totalBill)).append("\n");
        result.append("Per person cost before tip: $").append(String.format("%.2f", costPerPerson)).append("\n");
        result.append("Tip per person: $").append(String.format("%.2f", tipPerPerson)).append("\n");
        result.append("Total cost per person: $").append(String.format("%.2f", finalCostPerPerson)).append("\n");
        result.append("-------------------------------\n");

        return result.toString();
    }

    // TEST YOUR PROGRAM IN main
    public static void main(String[] args) {
        // Try different values for people, percent, and cost to test your program before running test cases
        int people = 7;
        int percent = 22;
        double cost = 65.50;

        System.out.println(calculateTip(people, percent, cost));
    }
}


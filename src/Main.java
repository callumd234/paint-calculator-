import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String PaintName = "Duffys Magic Paint";
        double priceOfPaintPerMeter = 6.24;
        int paintCoveragePerMeter = 10;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of walls you need painting?");
        int amountOfWalls = Integer.parseInt(userInput.nextLine());
        System.out.println("Please enter the height of your walls in meters?");
        int wallsHeight = Integer.parseInt(userInput.nextLine());
        System.out.println("Please enter the width of your walls in meters?");
        int wallsWidth = Integer.parseInt(userInput.nextLine());

        int wallTotalArea = (wallsWidth * wallsHeight) * amountOfWalls;

        System.out.println("How much do you charge per worker per hour of labour?");
        int pricePerHour = Integer.parseInt(userInput.nextLine());
        System.out.println("Roughly how many hours will this work take?");
        int howManyHoursWork = Integer.parseInt(userInput.nextLine());
        int howManyWorkers = amountOfWalls;
        System.out.println("What is the customers budget in pounds?");
        int customersBudget = Integer.parseInt(userInput.nextLine());




        int totalLabourCost = (pricePerHour * howManyHoursWork) * howManyWorkers;

        String laddersNeededOrNot = (wallsHeight >= 10) ? "Needs Ladder" : "Doesn't need Ladder";

        int paintCansNeeded = (int) Math.ceil(wallTotalArea / paintCoveragePerMeter);
        double totalPricePaint = (double) (paintCansNeeded * priceOfPaintPerMeter);
        double totalCost = totalPricePaint + totalLabourCost;
        if (customersBudget > totalCost) {
            System.out.println ("The customers budget is in range");
        } else if (customersBudget == totalCost) {

            System.out.println ("The customers budget is in range");
        }

        else {
            System.out.println("The quote is too expensive for the customer");
        }

        String message;
        switch (howManyHoursWork) {
            case 0:
                message = "No hours required to work";
                break;
            case 1:
                message = "One hours work is required";
                break;
            case 2:
                message = "Two hours work is required";
                break;
            default:
                message = "Over two hours work is required";
                break;
        }


        System.out.println("The total cost for " + PaintName + " will be " + totalPricePaint + " pounds");
        System.out.println("The total number of paint cans needed for this job is " + paintCansNeeded);
        System.out.println("The total number of walls we will be painting is " + amountOfWalls);
        System.out.println("The total area of the walls needed painting in meters is " + wallTotalArea);
        System.out.println("The total cost of labour hours is " + totalLabourCost + " pounds");
        System.out.println("The total cost for this job is " + totalCost + " pounds");
        System.out.println(laddersNeededOrNot);
        System.out.println(message);
    }

}



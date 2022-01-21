import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String PaintName = "Duffy Magic Paint";
        double priceOfPaintPerMeter = 6.24;
        int paintCoveragePerMeter = 10;


        Scanner userInput = new Scanner(System.in);
        System.out.println("What day will the work be started on?");
        String whatDayWillWeWorkOn = userInput.nextLine();

        System.out.println("Please enter the amount of walls you need painting?");
        int amountOfWalls = Integer.parseInt(userInput.nextLine());

        System.out.println("Please enter the height of your walls in meters?");
        int wallsHeight = Integer.parseInt(userInput.nextLine());

        System.out.println("Please enter the width of your walls in meters?");
        int wallsWidth = Integer.parseInt(userInput.nextLine());

        System.out.println("How many different shades off paint are required?");
        int amountOfDifferentShades = Integer.parseInt(userInput.nextLine());

        System.out.println("How much do you charge per worker per hour of labour?");
        int pricePerHour = Integer.parseInt(userInput.nextLine());

        System.out.println("Roughly how many hours will this work take?");
        int howManyHoursWork = Integer.parseInt(userInput.nextLine());

        System.out.println("How many workers will the job require?");
        int howManyWorkers = Integer.parseInt(userInput.nextLine());

        System.out.println("What is the customers budget in pounds?");
        int customersBudget = Integer.parseInt(userInput.nextLine());

        int wallTotalArea = (wallsWidth * wallsHeight) * amountOfWalls;

        int totalLabourCost = (pricePerHour * howManyHoursWork) * howManyWorkers;

        String laddersNeededOrNot = (wallsHeight >= 10) ? "You will need a ladder" : "You won't need a Ladder";

        int paintCansNeeded = (int) Math.ceil(wallTotalArea / paintCoveragePerMeter);
        double totalPricePaint =  Math.round(paintCansNeeded * priceOfPaintPerMeter * 100) / 100;
        double totalCost = Math.round(totalPricePaint + totalLabourCost * 100) / 100;

        if (customersBudget > totalCost) {
            System.out.println ("The customers budget is in range");
        } else if (customersBudget == totalCost) {
            System.out.println ("The customers budget is in range");
        }
        else {
            System.out.println("The quote is too expensive for the customer");
        }


        String message;
        switch (amountOfDifferentShades) {
            case 0:
                message = "No shade off paint is required";
                break;
            case 1:
                message = "One shade of paint is required";
                break;
            case 2:
                message = "Two shades off paint is required";
                break;
            default:
                message = "More than two shades off paint is required";
                break;
        }

        System.out.println("The total cost for " + PaintName + " will be " + totalPricePaint + " pounds");
        System.out.println("The total number of paint cans needed for this job is " + paintCansNeeded);
        System.out.println("The total number of walls we will be painting is " + amountOfWalls);
        System.out.println("The total cost of labour is " + totalLabourCost + " pounds");
        System.out.println("The total cost for this job is " + totalCost + " pounds");
        System.out.println(laddersNeededOrNot);
        System.out.println(message);
        System.out.println("The work will be started on " + whatDayWillWeWorkOn);
    }
}



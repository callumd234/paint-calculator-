import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String PaintName = "Duffys Magic Paint";
        int amountOfWalls;
        amountOfWalls = (int) (Math.random() * 10);
        double priceOfPaintPerMeter = 6.24;
        int paintCoveragePerMeter = 10;

        int wallHeight = 7;
        int wallWidth = 7;
        int wallTotalArea = wallHeight * wallWidth * amountOfWalls;

        int priceOfPainterPerHour = 30;
        int howManyHoursWorking = amountOfWalls;
        int totalLabourCost = priceOfPainterPerHour * howManyHoursWorking;


        int paintCansNeeded = (int) Math.ceil (wallTotalArea / paintCoveragePerMeter);

        double totalPricePaint = paintCansNeeded * priceOfPaintPerMeter;
        double totalCost = totalPricePaint + totalLabourCost;


        System.out.println("The total cost for " + PaintName + " dircdof this quote is " + totalPricePaint + " pounds");
        System.out.println("The total number of paint cans needed for this job is " + paintCansNeeded);
        System.out.println("The total number of walls we will be painting is " + amountOfWalls);
        System.out.println("The total area of the walls needed painting in meters is " + wallTotalArea);
        System.out.println("The total cost of labour hours is " + totalLabourCost + " pounds");
        System.out.println("The total cost for this job is " + totalCost + " pounds");
    }
    }

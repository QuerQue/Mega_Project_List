import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Tomek on 28/02/2016.
 */
public class CostOfTile {

    double area(double height, double width){
        return height*width;
    }

    double totalCost(double area, double price){
        return area*price;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width and height of roof: ");
        double height = in.nextDouble();
        double width = in.nextDouble();
        System.out.print("\nEnter price of 1m^2 of tile: ");
        double price = in.nextDouble();

        CostOfTile object = new CostOfTile();
        double result = object.totalCost(object.area(height, width), price);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Total cost of tiling: " +  df.format(result));
    }
}

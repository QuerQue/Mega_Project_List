import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;

/**
 * Created by Tomek on 2016-02-28.
 */
public class Change {

    final static double fifty = 0.50;
    final static double twenty = 0.20;
    final static double ten = 0.10;
    final static double five = 0.05;
    final static double two = 0.02;
    final static double one = 0.01;

    int numOfFifty = 0;
    int numOfTwenty = 0;
    int numOfTen = 0;
    int numOfFive = 0;
    int numOfTwo = 0;
    int numOfOne = 0;

    public static void main(String[] args){

        Change counter = new Change();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of a product: ");
        double price = in.nextDouble();
        System.out.print("\nEnter the amount of money: ");
        double moneyGiven = in.nextDouble();

        if(price > moneyGiven) {
            System.out.print("not enough money");
            System.exit(0);
        }

        double rest = moneyGiven - price;
        rest = Math.round(rest*100);
        rest = rest/100;
        System.out.print(rest+"\n");


        while(rest>0) {
            if(rest>=fifty) {
                rest -= fifty;
                counter.numOfFifty++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }
            if(rest>=twenty){
                rest -= twenty;
                counter.numOfTwenty++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }
            if(rest>=ten){
                rest -= ten;
                counter.numOfTen++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }
            if(rest>=five){
                rest -= five;
                counter.numOfFive++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }
            if(rest>=two){
                rest -= two;
                counter.numOfTwo++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }
            if(rest>=one){
                rest -= one;
                counter.numOfOne++;
                rest = Math.round(rest*100);
                rest = rest/100;
                continue;
            }


        }

        System.out.print("The rest:\n | "+fifty+" | "+twenty+" | "+ten+ " | "+five+ " | "+two+ " | "+one+"\n");
        System.out.print(counter.numOfFifty+" | "+counter.numOfTwenty+" | "+counter.numOfTen+ " | "+counter.numOfFive+ " | "+counter.numOfTwo+ " | "+counter.numOfOne);
    }
}

/**
 * Created by Tomek on 27/02/2016.
 */
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class Pi {
    public static void main(String[] args) {

        BigDecimal pi = new BigDecimal(Math.PI);
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Enter how many decimal places do you want to print of PI number: ");
            int num = in.nextInt();
            String decPlaces = "#."; //DecimalFormat formatuje liczbe i przyjmuje coś takiego #.000 ile zer tyle miejsc po przecinku
            if(num <0) {
                System.out.println("Argument must be grater than 0! ");
                continue;
            }
            for (int i = 0; i < num; i++)
                decPlaces += "0";

            DecimalFormat PrecPI = new DecimalFormat(decPlaces);
            System.out.println(PrecPI.format(pi));
        }
    }

}

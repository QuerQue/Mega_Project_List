import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Tomek on 28/02/2016.
 */
public class InterestRate {

    BigDecimal monthlyPayment(double loan, double rate, int term){
        rate = (rate/100)/12;
        BigDecimal result = new BigDecimal(loan * (rate/(1-Math.pow(1+rate, -term))));
        return result;
    }

    public static void main(String[] args){

        double loan=0;
        double rate=0;
        int term;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter loan: ");
        loan = in.nextDouble();
        System.out.print("Enter interest rate: ");
        rate = in.nextDouble();
        System.out.print("Enter term (months): ");
        term = in.nextInt();

        InterestRate object = new InterestRate();
        System.out.print("Your monthly paymant is: " + object.monthlyPayment(loan, rate, term));




    }
}

import java.util.Scanner;
import java.util.*;
/**
 * Created by Tomek on 28/02/2016.
 */
public class PrimeFactor {

    void Factorization(int num){
            System.out.print("Prime factorization of "+ num+" : ");
            for(int j=1; j<=num; j++){
                if(num%j==0)
                    System.out.print(j + " ");
            }

    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        PrimeFactor object = new PrimeFactor();
        while(true) {
            System.out.print("\nEnter a number you want to factorize: ");
            int number = in.nextInt();
            object.Factorization(number);
        }
    }
}

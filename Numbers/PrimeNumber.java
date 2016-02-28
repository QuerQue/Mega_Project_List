import java.util.Scanner;

/**
 * Created by Tomek on 28/02/2016.
 */
public class PrimeNumber {

    void PrimeNum(int k) {
        for(int i=2; i<=k; i++){
            int counter = 0;
            for(int j=1; j<(i+2)/2; j++ ){
                if((i%j) == 0)
                    counter ++;
            }
            if(counter < 2)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrimeNumber object = new PrimeNumber();
        System.out.print("Enter the highest possible prime number you want to get: ");
        int num = in.nextInt();
        object.PrimeNum(num);
    }
}

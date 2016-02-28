/**
 * Created by Tomek on 23/02/2016.
 */

import java.util.*;


public class Fibb {

    void fibbon(int num) {

        int a=0;
        int b=1;

        for(int i=0; i<num; i++) {
            System.out.print(b + " ");
            b +=a;
            a = b-a;
        }
    }

    //recursive Fibb sequence is much much slower
    int RecFibb(int num){
        if(num < 2)
            return 1;
        else
            return (RecFibb(num-1)+RecFibb(num-2));
    }

    public static void main(String[] args)
    {

        int k = Integer.parseInt(args[0]);
        Fibb object = new Fibb();

        long startTime = System.currentTimeMillis();
        object.fibbon(k);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("\nTime of  iterative alogirthm: " + totalTime + " ms");

        long startTime2 = System.currentTimeMillis();
        for(int l=0; l<k; l++)
                System.out.print(object.RecFibb(l) + " ");
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2-startTime2;
        System.out.println("\nTime of recursive alogirthm: " + totalTime2 + " ms");
    }
}


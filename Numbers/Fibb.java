/**
 * Created by Tomek on 23/02/2016.
 */

import java.util.*;


public class Fibb {

    int[] fibbon(int num) {
        int tab[] = new int[num];
        tab[0]=1;
        tab[1]=1;

        for(int i=2; i<num; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab;
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
        long startTime = System.currentTimeMillis();
        int k = Integer.parseInt(args[0]);
        int tab2[]= new int[k];
        Fibb object = new Fibb();
        tab2=object.fibbon(k);

        int i =0;
        while(i<k) {
            System.out.print(tab2[i] + " ");
            i++;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("\n" + totalTime);
    }
}


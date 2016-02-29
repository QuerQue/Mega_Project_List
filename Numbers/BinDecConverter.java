import java.util.*;

/**
 * Created by Tomek on 2016-02-29.
 */
public class BinDecConverter {

    List DecToBin(int numb){

        List<Integer> list = new ArrayList<Integer>();
        int i =0;
        while(numb>0)
        {
            list.add(numb%2);
            numb/=2;
            i++;
        }

        return list;
    }

    int BinToDec(String num){
        int result=0;
        for(int i=num.length()-1; i>=0; i--){
            result+=(num.charAt(i)-'0')*Math.pow(2, num.length()-i-1);
        }
        return  result;
    }

    void PrintList(List lista){
        for(int i=0; i<lista.size(); i++)
            System.out.print(lista.get(i));
    }

    public static void main(String[] args){

        BinDecConverter object = new BinDecConverter();
        int dec;

        List<Integer> lista;

        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter decimal number to convert to binary: ");
        dec = in.nextInt();

        lista=object.DecToBin(dec);
        Collections.reverse(lista);
        object.PrintList(lista);


        //##############################################
        int result;
        System.out.print("\nEnter binary number to convert to decimal: ");
        String bin;
        bin = in.next();
        result=object.BinToDec(bin);

        System.out.print(result);



    }

}



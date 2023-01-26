package ie.atu.week1;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myElementArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        /*
        for (int i = 0; i < myElementArray.length; i++)
        {
            System.out.println("Element at index " + i + ": " + myElementArray[i]);
        }

         */

        int indexValue = 0;

        for(int x:myElementArray)
        {
            System.out.println("Element at index " + indexValue + ": " + x);
            indexValue++;
        }

        Scanner myScanner = new Scanner(System.in);


        try
        {
            System.out.println("Please enter an integer number: ");
            myElementArray[10] = myScanner.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot proceed. The index is out of bounds.");
            System.out.println(e);
        }

        System.out.println("\n\nThe program ended.");
    }

    //public static void loop(ArrayList<Integer>)
    {

    }
}

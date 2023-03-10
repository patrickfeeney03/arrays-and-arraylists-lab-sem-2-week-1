package ie.atu.week1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myElementArray = new ArrayList<>();
        for(int i = 1; i < 11; i++)
        {
            myElementArray.add(100 * i);
        }
        loop(myElementArray);

        Scanner myScanner = new Scanner(System.in);

        try
        {
            System.out.println("Please enter an integer number: ");
            myElementArray.add(myScanner.nextInt());
            loop(myElementArray);
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            System.out.print("Cannot proceed. There was an error with your input.");
            System.out.println(e);
        }

        System.out.println("\n\nThe program ended.");
    }

    public static void loop(ArrayList<Integer> localArray)
    {
        int indexValue = 0;

        for(int x:localArray)
        {
            System.out.println("Element at index " + indexValue + ": " + x);
            indexValue++;
        }
    }
}

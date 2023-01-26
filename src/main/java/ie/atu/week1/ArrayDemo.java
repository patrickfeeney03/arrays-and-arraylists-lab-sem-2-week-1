package ie.atu.week1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myElementArray = new ArrayList<>();
        for(int i = 1; i < 11; i++)
        {
            myElementArray.add(100 * i);
        }

        int indexValue = 0;

        for(int x:myElementArray)
        {
            System.out.println("Element at index " + indexValue + ": " + x);
            indexValue++;
        }

        Scanner myScanner = new Scanner(System.in);

/*
        try
        {
            System.out.println("Please enter an integer number: ");
            myElementArray.add(10, myScanner.nextInt());
        }
        catch (InputMismatchException | IndexOutOfBoundsException e)
        {
            System.out.println("Cannot proceed. There was an error with your input.");
            System.out.println(e);
        }

 */
        System.out.println("Please enter an integer number: ");
        myElementArray.add(10, myScanner.nextInt());
        System.out.println("The new element added through user input is:" + myElementArray.get(10));

        System.out.println("\n\nThe program ended.");
    }

    public static void loop(ArrayList<Integer> localArray)
    {
        System.out.println("temp print");
    }
}

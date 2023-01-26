package ie.atu.week1;


import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myElementArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for (int i = 0; i < myElementArray.length; i++)
        {
            System.out.println("Element at index " + i + ": " + myElementArray[i]);
        }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        myElementArray[10] = myScanner.nextInt();
    }
}

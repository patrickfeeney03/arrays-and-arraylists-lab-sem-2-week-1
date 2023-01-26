package ie.atu.week1;


public class ArrayDemo {
    public static void main(String[] args) {
        int[] myElementArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for (int i = 0; i < myElementArray.length; i++)
        {
            System.out.println("Element at index " + i + ": " + myElementArray[i]);
        }
    }
}

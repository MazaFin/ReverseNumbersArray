import java.util.Scanner;

public class ReverseNumbersArray {

    public static void main(String[] args) {

        int count;
        double[] numbers;
        Scanner reader = new Scanner(System.in);

        System.out.print("How many floating point numbers do you want to type: ");
        count = reader.nextInt();
        numbers = new double[count];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Type in " + (i + 1) + ". number: ");
            numbers[i] = reader.nextDouble();

        }

        System.out.println("Given numbers in reverse order:");

        for (int i = numbers.length-1; i >= 0 ; i--) {

            System.out.println(numbers[i]);

        }

    }

}
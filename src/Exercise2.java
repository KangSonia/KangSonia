import java.util.Scanner;
           public class Exercise2 {
    public static void main(String[] args) {
        // Declare an array to hold 10 decimal values and calculate sum of this values
        double [] tenArray = new double[10];
        double sum = 0;
        for (int i = 0; i <10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the Number " + i +":");
            tenArray[i] = scanner.nextDouble();

            sum+=  tenArray[i];
        }

        System.out.println();
        System.out.println (tenArray);
        System.out.println();
        System.out.println("The total sum of all the array inputs is "+sum+".");


    }

    }



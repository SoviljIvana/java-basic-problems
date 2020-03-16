import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter five integers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        System.out.println(number1 + "\t" + number2 + "\t" + number3 + "\t" + number4 + "\t" + number5);

        int array[] = new int[5];
        array[0] = number1;
        array[1] = number2;
        array[2] = number3;
        array[3] = number4;
        array[4] = number5;

        int sumIs;

        sumIs = sum(array, 0);
        System.out.println(sumIs);

        sumIs = sum(array, 1);
        System.out.println(sumIs);


    }

    private static int sum(int[] array, int number0or1) {

        int sum = 0;
        switch (number0or1) {
            case 0:
                for (int index = 0; index < array.length - 1; index++)
                    sum += array[index];
                break;
            case 1:
                for (int index = 1; index < array.length; index++)
                    sum = sum + array[index];
                break;
            default:
                sum = 0;
        }
        return sum;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Optional_task1 {

    public static void main(String[] args) {
        int n  = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Now enter your numbers in a single of the line: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        //1
        Arrays.sort(array);
        System.out.println("Shortest number is: " + array[0] + " and they length is: " + ((int) Math.log10(array[0]) + 1));
        System.out.println("Longest number is: " + array[n - 1] + " and they length is: " + ((int) Math.log10(array[n-1]) + 1));

        //2
        for (int j : array) {
            System.out.println(j);
        }

    }
}

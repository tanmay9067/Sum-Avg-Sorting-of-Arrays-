import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the length of array (1 to 20): ");
        int n = scanner.nextInt();
        while(n > 20 || n < 1){
            System.out.println("Invalid Input");
            n = scanner.nextInt();
        }
        int [] numbers = new int[n];
        //make function for purpose
        addArrayToIndex(numbers);
        showArrayFromListings(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void showArrayFromListings(int[] numbers) {
        System.out.print("The Solution is: ");
    }

    private static void addArrayToIndex(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = input.nextInt();
        }
    }
}

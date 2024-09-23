import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        int sum = 0;
        for(int i = 0 ; i < ages.length ; i++ ){
            sum += ages[i];
        }
        System.out.println("The sum of the all arrays is: " + sum);
        double avg = (double)sum / (double) ages.length;
        System.out.println("The average of the all arrays is: " + avg);
    }


}



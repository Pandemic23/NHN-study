package NHN_practie.Day2.Demonstration;

import java.util.Scanner;

public class Demonstrate {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter a dight: ");
        int i = scanner.nextInt();

        double f = 5.9 * (i-32);
        System.out.println("섭씨 온도:"+ f);



        scanner.close();
    }
}

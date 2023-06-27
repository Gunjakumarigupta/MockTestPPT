package Lab4Assignment;

import java.util.Scanner;

public class Q_1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter a message:");
        String message = sc.next();
        while (i <= 10){
            System.out.println(i + " " + message);
            i++;
        }
    }
}

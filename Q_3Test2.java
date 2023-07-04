package MockTest2;

import java.util.Scanner;

public class Q_3Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers :");
        float sum = 0;
        float average = 0;
        int count = 1;
        do{
            float x =  sc.nextInt();
            sum+=x;
            count++;
        } while (count <= n);
        average = sum/n;
        System.out.println(average);
    }
}
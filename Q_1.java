package MockTest1;

import java.util.Scanner;
public class Q_1 {
    public static void movesZeroes(int nums[]){
        int n = nums.length;
        int k = 0;
        if(n==0){
            return;
        }
            for(int i = 0; i<n; i++)
                if(nums[i]!=0)
                    nums[k++]=nums[i];
            while(k < n)
                    nums[k++] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        movesZeroes(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

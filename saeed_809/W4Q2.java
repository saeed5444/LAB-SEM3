package saeed_809;

import java.util.*;

public class W4Q2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of elements :");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            System.out.print("Enter " +(i+1)+ " elements :");
            arr[i] = sc.nextInt();
            
            sum +=arr[i];
        
        }
        System.out.println("sum is "+sum);
        
        
    }
    
}

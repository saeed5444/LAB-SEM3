
package saeed_809;

import java.util.Scanner;

public class W4Q1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i = 0;i<n;i++){
            System.out.print("Enter element " +(i+1)+": ");
            arr[i] = sc.nextInt();

        }
        System.out.println("elements are :");
        for(int e:arr){
            System.out.print(e +"  ");
        }
        System.out.println ("");

    }
    

}


package saeed_809;

import java.util.Scanner;

public class W3Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x = sc.nextInt();
        if(x%2==0)
            System.out.println("Number is even");
        else
            System.out.println("number is odd");
    }

}


package saeed_809;

import java.util.Scanner;

public class W3Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers is: " + sum);
    }

}

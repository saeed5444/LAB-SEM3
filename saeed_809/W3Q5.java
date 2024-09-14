
package saeed_809;

import java.util.Scanner;

public class W3Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double x = sc.nextDouble();
        while(x>10){
            x=x/2;
            System.out.println(x);
        }
    }

}

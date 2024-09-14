
package saeed_809;

import java.util.Scanner;

public class W3Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("Enter Y");
        int y = sc.nextInt();
        System.out.println("Enter Z");
        int z = sc.nextInt();

        if(x>y){
            if(x>z)
                System.out.println("X is biggest");
            else
                System.out.println("Z is biggest");
        }
        else {
            if(y>z)
                System.out.println("Y is biggest");
            else
                System.out.println("Z is biggest");

        }
    }

}

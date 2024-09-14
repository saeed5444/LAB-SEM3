package saeed_809;

import java.util.Scanner;

public class W4Q4 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        double sum=0;
    
    for(int i = 1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println("Sum is "+sum);
    }
}

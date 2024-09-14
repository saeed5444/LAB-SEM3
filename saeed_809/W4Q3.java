package saeed_809;

import java.util.Scanner;

public class W4Q3 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. Rows :");
        int n = sc.nextInt();
         for(int i = 1;i<=n;i++){
             for(int k =1;k<=n-i;k++){
                 System.out.print("  ");  
             }
             
              for(int j = 1;j<=i;j++){
                  System.out.print(j+" ");
        }
              for(int m=i-1;m>0;m--){
                  System.out.print(m+" ");
              }
            System.out.println("");
            
            
        }
    }
}


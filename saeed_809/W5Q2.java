package saeed_809;
import java.util.*;
public class W5Q2 {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number: ");
        int count=0;
        int n = sc.nextInt();
       
        for(int i=1;i<=(n);i++ ){
            if(n%i==0){
                count++;
            }
        }
        if (count==2)
            System.out.println("prime");
        else
            System.out.println("not prime");
            
    }
    
}

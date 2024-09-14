
package saeed_809;

public class W5Q5 {

    
    public static void main(String[] args) {


        for(int i=0;i<=100;i++)
        {
           int cou=0;
             for(int j=1;j<=i;j++)
                 {
                    if(i%j==0)
                      cou++;
                }
             if(cou==2)
                System.out.println(i);
        }
    }

}

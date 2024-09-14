
package saeed_809;

public class W5Q3 {

    public static void main(String[] args) {
        int ar[]={90,45,61,95,51,44};
        int t;
        t=ar[0];
        ar[0]=ar[ar.length-1];
        ar[ar.length-1]=t;
        for(int e :ar)
            System.out.println(e);
            
    }
    
}

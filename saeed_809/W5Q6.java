package saeed_809;

import java.util.Scanner;

public class W5Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        int l=array.length;
        boolean element =false;
        for(int i=0;i<l;i++){
            System.out.println("enter element "+(i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int s_element = sc.nextInt();
        for (int j = 0;j<l;j++){
            if (array[j]==s_element){
                System.out.println(s_element +" is at array["+j+"]");
                element = true;
            }
            
        }
            if(!element)
                System.out.println("Number is not present");
    }
    
}

package saeed_809;

public class W5Q4 {
    
    public static void main(String[] args) {
        int arr[]={10,54,78,41,53,92,13};
        int min=arr[0];
        int max=arr[0];
        for(int ele: arr){
            if(ele>max){
                max=ele;
            }
            if(ele<min){
                min=ele;
            }
        }
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);
    }
    
}

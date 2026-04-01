import java.util.Scanner;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==tar){
                res=mid;
                break;
            }
            if(arr[mid]<tar){
                mid++;
                res=mid;
            }else{
               mid--;
               res=mid;
            }
        }
        if(res==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element: "+ tar +", Found at index: "+ res);
        }
    }
}

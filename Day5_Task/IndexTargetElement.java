import java.util.*;
public class IndexTargetElement{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int tar=sc.nextInt();
    int left=0,right=n-1;
    int res=-1;
    while(left<=right){
        int mid =(left+right)/2;
        if(arr[mid]==tar){
            res=mid;
            break;
        }else if(arr[mid]<tar){
            left=mid-1;
        }else{
            right=mid-1;
        }
    }
    System.out.println(res);
    }
}
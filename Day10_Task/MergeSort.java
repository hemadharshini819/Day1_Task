import java.util.*;
public class Main{
    public static void msort(int[] arr,int start,int mid,int end){
        int i=start; 
        int j=mid;
        int k=start;
        int []res=new int[arr.length];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
               res[k]=arr[i];
               i++;
               k++;
            }
            else{
                res[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            res[k]=arr[i];
            k++;
            i++;
        }
        while(j<end){
            res[k]=arr[j];
            k++;
            j++;
        }
        for(int num=start;num<end;num++){
            arr[num]=res[num];
        }
    }
    public static void merge(int[] arr,int start,int end){
        if(end-start==1){
             return;
        }
        int mid=(start+end) / 2;
        merge(arr,start,mid);
        merge(arr,mid,end);
        msort(arr,start,mid,end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        merge(arr, 0, num);
        System.out.println(Arrays.toString(arr));
    }
}

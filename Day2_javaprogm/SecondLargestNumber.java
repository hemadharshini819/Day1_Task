import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        int sec=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<lar){
                sec=lar;
                lar=arr[i];
            }
            else if(arr[i]>sec && arr[i]!=lar){
                sec=arr[i];
            }
        }
        System.out.println("Second Largest Number: "+sec);
    }
}
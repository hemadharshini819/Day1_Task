import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fir=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int num:arr){
            if (num>fir){
                sec=fir;
                fir=num;
            }else if(num>sec&&num!=fir){
                sec=num;
            }
        }
        if(sec==Integer.MIN_VALUE){
            System.out.println("No second largest found.");
        }
        else{
            System.out.println("Second Largest Number is: " +sec);
        }
    }
}
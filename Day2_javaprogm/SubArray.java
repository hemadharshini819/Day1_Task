import java.util.*;
public class SubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();//[-2,1,-3,4,-1,2,1,-5,4]
        int []arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int cal=arr[0];
        int maxi=arr[0];
        for(int i=1;i<num;i++){
            cal=Math.max(arr[i],cal+arr[i]);
            maxi=Math.max(maxi,cal);
        }
        System.out.println(maxi);//6

    }
}
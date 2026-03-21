import java.util.*;
class TwoSum{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int[] arr=new int[num];
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();
    }
    int tar=sc.nextInt();
    int l=0,r=num-1;
    boolean ex=false;
    while(l<r){
        int sum=arr[l]+arr[r];
        if(sum==tar){
            System.out.println(l + ", " + r);
            ex=true;
            break;
        }else if(sum<tar){
            l++;
        }else{
            r--;
        }
    }
    }
}
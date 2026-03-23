import java.util.*;
class MoveZeros{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0;
        for(int i=0;i<num;i++){
            if(arr[i]!=0){
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
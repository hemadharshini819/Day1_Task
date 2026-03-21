import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int use=0;
        for(int i=1;i<num;i++){
            if(arr[i]!=arr[use]){
                use++;
                arr[use]=arr[i];
            }
        }for(int i=0;i<=use;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
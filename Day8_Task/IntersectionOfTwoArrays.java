import java.util.*;
class IntersectionOfTwoArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int arr1[]=new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=sc.nextInt();
        }
        int num2=sc.nextInt();
        int arr2[]=new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    } 
}
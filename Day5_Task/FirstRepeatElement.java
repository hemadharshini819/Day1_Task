import java.util.*;
class FirstRepeatElement{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<num;i++){
        arr[i]=sc.nextInt();
    }
    HashSet <Integer> set= new HashSet<>();
    for(int n:arr){
        if(set.contains(n)){
        System.out.println(n);
        return;
        }
    set.add(n);
    }
    }
}
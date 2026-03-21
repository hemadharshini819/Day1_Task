import java.util.*;
class FirstNonRepeatElement{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int nums=sc.nextInt();
    int[] arr=new int[nums];
    for(int i=0;i<nums;i++){
        arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    boolean state=false;
    for(int num:arr){
        if(map.get(num)==1){
            System.out.println(num);
            state=true;
            break;
        }
    }
    if(!state){
        System.out.println("No non repeating values");
    }
    }

}
import java.util.*;
public class duplicates{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
		   arr[i]=sc.nextInt();
		}
		HashSet<Integer> ori = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		for(int set:arr){
		    if (ori.contains(set)){
                dup.add(set);
            } else{
                ori.add(set);
            }
        }
        System.out.println(dup);
	}
}
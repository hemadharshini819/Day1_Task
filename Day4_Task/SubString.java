import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashSet<Character> set = new HashSet<>();
		int l=0;
		int maxlen=0;
		for(int r=0;r<str.length();r++){
		    while(set.contains(str.charAt(r))){
		        set.remove(str.charAt(l));
		        l++;
		    }
		    set.add(str.charAt(r));
		    maxlen=Math.max(maxlen,r-l+1);
		}
		System.out.println(maxlen);
	}
}
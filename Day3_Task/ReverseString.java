import java.util.*;
class ReverseString{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char[] str = s.toCharArray(); 
	    int left=0;
	    int right=str.length-1;
	    while(left<right){
	        char temp=str[left];
	        str[left]=str[right];
	        str[right]=temp;
	    left++;
	    right--;
	    }
	    String res=new String(str);
	    System.out.println(res);
	    
	}
}
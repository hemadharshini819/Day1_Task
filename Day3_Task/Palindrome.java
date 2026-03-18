import java.util.*;
class Panlindrome{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int temp=num;
	    int rev=0,remain=0;
	    while(num!=0){
	        remain=num%10;
	        rev=rev*10+remain;
	        num=num/10;
	    }
	    if(temp==rev){
		    System.out.println("True");
	    }
		else{
		    System.out.println("False");
		}
	}
}
import java.util.*;
public class Reverse_Number{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int reverse=0,remain=0;
      while(num!=0){
          remain=num%10;
          reverse= reverse*10+remain;
          num=num/10;
      }
      System.out.println(reverse);
    }
}
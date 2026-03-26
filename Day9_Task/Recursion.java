import java.util.Scanner;
public class Recursion{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()){
            int num=sc.nextInt();
            if(num<0){
                System.out.println("Factorial not possible for negative numbers.");
            }else{
                int result=factorial(num);
                System.out.println("Output: "+result);
            }
        }else{
            System.out.println("Invalid input!");
        }
    }
}
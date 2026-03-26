import java.util.*;
public class Fibonacci{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i=0;i<count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
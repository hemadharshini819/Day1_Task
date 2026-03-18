import java.util.Scanner;
class ValidPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rep=str.toLowerCase().replaceAll(" ","");
        int left=0;
        int right=rep.length()-1;
        boolean palin=true;
        while(left<right){
            if(rep.charAt(left)!=rep.charAt(right)){
                palin=false;
                break;
            }
            left++;
            right--;
        }
        if(palin){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
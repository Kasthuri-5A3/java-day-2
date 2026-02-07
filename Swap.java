import java.util.Scanner;
public class Swap{
    public  static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a=ob.nextInt();
        System.out.println("Enter the b value:");
        int b=ob.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A:"+a);
        System.out.println("b;"+b);

    }
}
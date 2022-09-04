import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Sayı 1: ");
        n1 = input.nextInt();
        System.out.print("Sayı 2: ");
        n2 = input.nextInt();
        System.out.print("Sayı 3: ");
        n3 = input.nextInt();

        if(n1>n2&&n1>n3){
            if(n2>n3){
                System.out.println(n1+ ", "+n2 + ", "+n3);
            }
            else{
                System.out.println(n1+ ", "+n3 + ", "+n2);
            }
        }
        else if (n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println(n2+ ", "+n1 + ", "+n3);
            }
            else{
                System.out.println(n2+ ", "+n3 + ", "+n1);
            }
        }
        else if (n3>n1&&n3>n2)
        {
            if(n1>n2){
                System.out.println(n3+ ", "+n1 + ", "+n2);
            }
            else{
                System.out.println(n3+ ", "+n2 + ", "+n1);
            }

        }
    }
}
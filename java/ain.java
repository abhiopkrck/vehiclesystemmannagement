package java;
import java.util.Scanner;;
public class ain {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int a,b,c;
        do{
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            System.out.println("6.Exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            if (choice >=1 && choice <=5) {
                System.out.println("Enter first number:");
                a=sc.nextInt();
                System.out.println("Enter second number:");
                b=sc.nextInt();
            }else{
                a=b=0;
            }
            switch (choice) {
                case 1:
                    c= a + b;
                    System.out.println("Sum:"+c);
                    continue;
            
                case 2:
                    c= a - b;
                    System.out.println("Subtraction is:"+c);
                    continue;
            
                case 3:
                    c= a * b;
                    System.out.println("Multiplication is:"+c);
                    continue;
            
                case 4:
                    c= a / b;
                    System.out.println("Division is:"+c);
                    continue;
            
                case 5:
                    c= a % b;
                    System.out.println("Modulus is:"+c);
                    continue;
                case 6:
                  
                    System.out.println("Bye........");
                    break;
                 
            
                default:
                    break;
            }
        } while (choice !=0);
        sc.close();
                
        

    }
}
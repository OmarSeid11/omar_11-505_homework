package homeworks;
import java.util.Scanner;
public class HW3 {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        int n1,n2;
        char  c;
        do{
                System.out.println("Enter n1: ");
                n1 = in.nextInt();
                System.out.println("Enter n2: ");
                n2 = in.nextInt();

                System.out.println("Enter one of these operators:");
                System.out.println("+");
                System.out.println("-");
                System.out.println("*");
                System.out.println("/");
                System.out.println("%");
                System.out.println("or enter q to exit: ");
                c = in.next().charAt(0);

                switch(c){
                    case '+':
                        System.out.println("res= "+ (n1 + n2));
                        break;
                    case '-':
                        System.out.println("res= "+ (n1 - n2));
                        break;
                    case '*':
                        System.out.println("res= "+ (n1 * n2));
                        break;
                    case '/':
                        System.out.println("res= "+ (n1 / n2));
                        break;
                    case '%':
                        System.out.println("res= "+ (n1 % n2));
                        break;
                    // default:
                    //     System.out.println("error!");
                    //     break;
                }
            }while(c!='q');   
    }
 }
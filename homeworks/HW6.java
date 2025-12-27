package homeworks;
import java.util.Scanner;
public class HW36 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter your grade: ");
    int grade = in.nextInt();

    if (grade<=100 && grade>=56){
        System.out.println("you passed!");
    }
    else if (grade<56 && grade >=0){
        System.out.println("you fail!");
    }else{
        System.out.println(grade +" is not an option!");
    }
}
}

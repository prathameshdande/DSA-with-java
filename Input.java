import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int secNum = sc.nextInt();
        int ans = firstNum + secNum;
        System.out.println("Answer is : "+ans);

        sc.close();    //best practice
    }
}
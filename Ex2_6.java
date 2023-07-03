import java.util.Scanner;
public class Ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount : ");
        
        double money = input.nextDouble();
        double interest = 0.00417;
        double first = money * (1 + interest);
        double second = (money+first) * (1 + interest);
        double third = (money+second) * (1 + interest);
        double fourth = (money+third) * (1 + interest);
        double fifth = (money+fourth) * (1 + interest);
        double sixth = (money+fifth) * (1 + interest);

        System.out.println("After the sixth month, the account value is " +sixth);
        input.close();
    }
}
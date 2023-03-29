import java.util.Scanner;

public class randomgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-5중 숫자 하나를 고르시오 >> ");
        int i = sc.nextInt();
        int j = (int)(Math.random() * 5) + 1;
        if (i == j) {
            System.out.println("MATCH!");
        } else {
            System.out.println("NOT MATCH!");
        }
        sc.close();
    }
}
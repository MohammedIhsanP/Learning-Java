import java.util.Scanner;

public class check {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        if (number%2==0){
            System.out.println("The entered number is even");
        }
        else {
            System.out.println("The entered number is odd");
        }
    }
}

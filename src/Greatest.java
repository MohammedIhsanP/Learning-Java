import java.util.Scanner;

public class Greatest {

    Integer FirstNum;
    Integer SecondNum;
    Integer ThirdNum;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Greatest ob = new Greatest();

        System.out.println("Enter the First number:");
        ob.FirstNum=sc.nextInt();
        System.out.println("Enter the second number:");
        ob.SecondNum=sc.nextInt();
        System.out.println("Enter the third number:");
        ob.ThirdNum=sc.nextInt();
        Integer largest;

        if (ob.FirstNum>ob.SecondNum){
                largest = ob.FirstNum;
            if (ob.FirstNum>ob.ThirdNum){
                largest = ob.FirstNum;
            }
            else {
                largest = ob.ThirdNum;
            }
        }
        else if (ob.SecondNum>ob.ThirdNum) {
            largest = ob.SecondNum;
        }
        else {
            largest = ob.ThirdNum;
        }

        System.out.println("largest number is:" + largest);



}



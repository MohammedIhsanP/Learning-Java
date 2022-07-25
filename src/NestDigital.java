import java.util.Scanner;

public class NestDigital {

    String EmpName;
    String EmpCode;
    String Designation;
    Integer Salary;

    public static void main(String[] args) {

        System.out.println("Hello world!!");
        Scanner input = new Scanner(System.in);
        NestDigital ob= new NestDigital();

        for (Integer i=0; i<10; i++){
            System.out.println(i);
        }

        System.out.println("Enter Employee name : ");
        ob.EmpName = input.next();
        System.out.println("Enter Employee Code : ");
        ob.EmpCode = input.next();
        System.out.println("Enter the Designation : ");
        ob.Designation = input.next();
        System.out.println("Enter the Salary : ");
        ob.Salary = input.nextInt();

        System.out.println(ob.EmpName);
        System.out.println(ob.EmpCode);
        System.out.println(ob.Designation);
        System.out.println(ob.Salary);



    }
}

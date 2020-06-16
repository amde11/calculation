import java.util.Scanner;

public class add {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputfirst = input.nextInt();
        System.out.println("Enter another number:");
        int inputsecond = input.nextInt();
        int sumtotal = inputfirst + inputsecond;
        System.out.println("Sum :" + sumtotal);
        int prodtotal = inputfirst * inputsecond;
        System.out.println("Product :" + prodtotal);

        int squre = inputfirst * inputfirst;
        System.out.println("The squre :" + squre);
        Scanner inputxt = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String firsstring = inputxt.nextLine();
        System.out.println("Enter the second string :");
        String secondstring = inputxt.nextLine();

        System.out.println(firsstring + secondstring);



    }
}

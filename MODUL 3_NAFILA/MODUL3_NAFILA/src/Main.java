import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            boolean repeat=true;
            Calculation calculation = new Calculation();
            System.out.println("=== Menu Program === ");
            System.out.println("1. Square \n2. Circle \n3. Trapezoid");
            System.out.print("Select Menu : ");
            int hm = input.nextInt()
            do{
                try{
                    switch(hm){
                        case 1:
                            System.out.print("Enter the length side of the Square : ");
                            double side = input.nextInt();
                            calculation.run();
                            System.out.println("\nThe calculation result: " + calculation.getSquare());
                            
                            break;
                        case 2:
                            System.out.print("Enter the radius of the Circle : ");
                            double radius = input.nextInt(); 
                            break;
                        case 3:
                            System.out.print("Enter the base side of the Trapezoid : ");
                            double a= input.nextInt();
                            System.out.print("Enter the upper side of the Trapezoid : ");
                            double b= input.nextInt();
                            System.out.print("Enter the height of the Trapezoid : ");
                            double t= input.nextInt();  
                            break;
                        default:
                            System.out.println("Option not Available");
                            continue;
                    }
                    repeat = false;
                }catch(InputMismatchException e){
                    System.out.println("Input must be a number");
                }catch(IllegalArgumentException iae){
                    iae.printStackTrace();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }while(repeat);
            input.close();
             
            
        }
    }
    
}
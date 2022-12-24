import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int customerID, orderQty;
            try {
                System.out.print("Input your Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Enter how many food menu to make: ");
                orderQty = input.nextInt();
                
                Restaurant restou = new Restaurant();
                Thread t1 = new Thread(restou);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("\nInteger only please!\n");
            }
        }

    }
}

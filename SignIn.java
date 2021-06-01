import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Tamara";
        String password = "ThisIs.JAVA";
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome! Please, sign in below\n");
        System.out.print("• Username: ");
        //pick username
        String user=scan.nextLine();
        System.out.print("• Password: ");
        //pick password
        String passwo=scan.nextLine();


        while (!user.equals(username) && !passwo.equals(password)) {
            System.out.println("Wrong data. Try again!");
            System.out.print("\n"+"• Username: ");
            user=scan.nextLine();
            System.out.print("• Password: ");
            passwo=scan.nextLine();
        }
        System.out.println("\nSign in successful. Welcome back!");
        scan.close();

        
    }
}

package EmailMainPackage;
import java.util.Scanner;
public class MainClassEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Name = ");
		String firstName = input.nextLine();
		System.out.println("Enter your Last name = ");
		String lastName = input.nextLine();
		EmailClass email = new EmailClass(firstName, lastName);
		email.AllInfo();
	}

}

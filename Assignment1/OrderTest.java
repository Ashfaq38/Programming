import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Order order = new Order("laptop", "Computers and Elecgronics", "123 xyz, Chicago",1,"Credit card");
		
		order.displayItem();
		System.out.println("\n");
		System.out.println("Is this your first time shopping experience here?\n Please enter y for yes and n for no");
		char input = (char) scanner.next().charAt(0);
		if (input == 'y') {
			order.newCustomerDiscount();
		}
		else {
			System.out.println("Enjoy Shopping");
		}
		
		System.out.println("\n");
		System.out.println("Update Address?");
		
		char input2 = (char) scanner.next().charAt(0);
		if (input == 'y') {
			System.out.println("Current Address :"+order.getBillAddress());
			order.changeAddress();
			System.out.println("New Bill Address is :" +order.getBillAddress());
		}
		else {
			
			System.out.println("Enjoy Shopping");
		}
		
		

	}

}

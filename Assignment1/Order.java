import java.util.Scanner;

public class Order {
	
	Scanner scanner = new Scanner(System.in);
	
	private String item;
	private String description;
	private String billAddress;
	private int quantity;
	private String payment;
	private double price;
	
	public Order(String item, String description, String billAddress, int quantity, String payment) {
		//super();
		this.item = item;
		this.description = description;
		this.billAddress = billAddress;
		this.quantity = quantity;
		this.payment = payment;
		this.price = 1000.00;
	}
	
	public void displayItem() {
		System.out.println("Your Item details: \nItem Name :" +getItem()+"\nDescription :" +getDescription()+"\nBill Address :" +getBillAddress()+"\nQuantity :" +getQuantity()+"\nPayment mode :" +getPayment());
	}
	


	public String getItem() {
		return item;
	}

	

	public String getDescription() {
		return description;
	}

	

	public String getBillAddress() {
		return billAddress;
	}

	

	public int getQuantity() {
		return quantity;
	}

	

	public String getPayment() {
		return payment;
	}
	
	public double getPrice() {
		return price;
	}


	public void changeAddress() {
		System.out.println("Enter the new Address");
		String newAddress = scanner.nextLine();
		billAddress = newAddress;
		System.out.println("Address changed Successfully.");
		
	}
	
	public void newCustomerDiscount() {
		System.out.println("SignUp for 50% discount");
		System.out.println("Price of "+getItem()+ "is "+getPrice());
		
		this.price = price/2;
		
		System.out.println("Price of "+getItem()+" after discount is:"+getPrice());
	}





	




	
	
	
	
	
}
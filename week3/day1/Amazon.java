package week3.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("User pay after receving product");
		
	}

	@Override
	public void upiPayment() {
		System.out.println("User pay through any UPI");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("User pay through credit or debit card");
		
	}

	@Override
	public void internetBanking() {
        System.out.println("User pay through internet banking");		
	}
public static void main(String[] args) {
	Amazon amz = new Amazon();
	amz.cashOnDelivery();
	amz.upiPayment();
	amz.cardPayments();
	amz.internetBanking();
	//implemented from Abstract class 
	amz.userDetails();
}

@Override
void recordPaymentDetails() {
	// TODO Auto-generated method stub
	
}
}

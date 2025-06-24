package week3.day1;

public interface Payment {

	void cashOnDelivery();
	void upiPayment();
	void cardPayments();
	void internetBanking();
	
	default void userDetails() {
		System.out.println("User use canara bank for payment");
	}
}

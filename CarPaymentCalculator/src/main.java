
public class main {

	public static void main(String[] args) {
		
		CarPaymentCalculator c1 = new CarPaymentCalculator(35000,0,60,0.1);
		System.out.println(c1.monthlyCarPayment());
		System.out.println(c1.totalInterest());

	}

}

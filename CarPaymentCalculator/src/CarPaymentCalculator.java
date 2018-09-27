
public class CarPaymentCalculator {
	
	private double totalPrice;
	private double downPayment;
	private int lengthOfLoanInMonths;
	private double interestRate;
	
	public CarPaymentCalculator(double totalPrice, double downPayment, int lengthOfLoanInMonths, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.lengthOfLoanInMonths = lengthOfLoanInMonths;
		this.interestRate = interestRate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public int getLengthOfLoanInMonths() {
		return lengthOfLoanInMonths;
	}

	public void setLengthOfLoanInMonths(int lengthOfLoanInMonths) {
		this.lengthOfLoanInMonths = lengthOfLoanInMonths;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double monthlyCarPayment()
	{
		return (totalPrice*(interestRate/12))
				/
				(1-Math.pow((1+(interestRate/12)),(-lengthOfLoanInMonths)));
	}
	
	public double totalInterest()
	{
		return this.monthlyCarPayment()*lengthOfLoanInMonths-totalPrice;
	}
	
	
	
}

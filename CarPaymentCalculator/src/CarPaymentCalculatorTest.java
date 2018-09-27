

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class CarPaymentCalculatorTest {

	@Test
	public void monthlyCarPayment_Test1() {
		
		CarPaymentCalculator c1 = new CarPaymentCalculator(35000,0,60,0.1);
		double mcp = c1.monthlyCarPayment();
		
		assertTrue(Math.abs(mcp-743.65)<0.01);

	}
	
	@Test
	public void monthlyCarPayment_Test2() {
		
		CarPaymentCalculator c1 = new CarPaymentCalculator(300000,0,144,0.08);
		double mcp = c1.monthlyCarPayment();
		
		assertTrue(Math.abs(mcp-3247.36)<0.01);
		
	}
	
	@Test
	public void totalInterest_Test1() {
		
		CarPaymentCalculator c1 = new CarPaymentCalculator(35000,0,60,0.1);
		double ti = c1.totalInterest();
		
		assertTrue(Math.abs(ti-9618.79)<0.01);
		
	}
	
	@Test
	public void totalInterest_Test2() {
		
		CarPaymentCalculator c1 = new CarPaymentCalculator(300000,0,144,0.08);
		double ti = c1.totalInterest();
		
		assertTrue(Math.abs(ti-167619.52)<0.01);
		
	}

}

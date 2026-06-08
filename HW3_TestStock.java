package chapter9;

public class HW3_TestStock {

	public static void main(String[] args) {
		
			
// -- Creating Stock Object
		Stock myStock = new Stock("ORCL", "Oracle Corportion");
		myStock.setPreviousClosingPrice(34.5);
		myStock.setCurrentPrice(34.35);
		System.out.println(myStock);
		
// -- Creating Stock Object
		Stock yourStock = new Stock("AAPL", "Apple Inc.");
		yourStock.setPreviousClosingPrice(34.5);
		yourStock.setCurrentPrice(302);
		System.out.println(yourStock);	

	}

}

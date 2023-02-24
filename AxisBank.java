package week4.day2;

public class AxisBank {
	public void deposit(int deposit) {
		System.out.println("Deposit is"+ deposit);
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit(2000);
		
	}

}

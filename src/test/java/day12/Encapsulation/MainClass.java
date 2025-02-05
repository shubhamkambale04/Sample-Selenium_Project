package day12.Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Account acc = new Account();

		// Setting account number
		acc.setAccno(84654);
		int anum = acc.getAccno();
		System.out.println("Account Number: " + anum);

		// Setting account name
		acc.setAccname("John");
		String aname = acc.getAccname();
		System.out.println("Account Name: " + aname);

		// Setting account balance/amount
		acc.setAmount(6684.5);
		double avlbal = acc.getAmount(); // Correct method call
		System.out.println("Account Balance: " + avlbal);
	}
}

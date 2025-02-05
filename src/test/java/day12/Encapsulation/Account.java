package day12.Encapsulation;

public class Account {

	private int accno;
	private String accname;
	private double amount;

	public void setAccno(int no) {
		this.accno = no;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccname(String name) {
		this.accname = name;
	}

	public String getAccname() {
		return accname;
	}

	public void setAmount(double amt) {
		this.amount = amt;
	}

	public double getAmount() {
		return amount;
	}
}

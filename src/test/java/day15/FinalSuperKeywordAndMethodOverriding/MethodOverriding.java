package day15.FinalSuperKeywordAndMethodOverriding;

class Bank {
	double roi() {
		return 0;
	}
}

class ICICI extends Bank {
	double roi() {
		return 11.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 11.5;
	}
}

class HDFC extends Bank {
	double roi() {
		return 11.0;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Bank bk =new Bank();
		System.out.println(bk.roi());
		
		ICICI ik =new ICICI();
		System.out.println(ik.roi());
		
		SBI sb =new SBI();
		System.out.println(sb.roi());
		
		HDFC hf =new HDFC();
		System.out.println(hf.roi());

	}

}

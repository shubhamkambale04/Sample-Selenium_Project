package day44;

import org.testng.annotations.Test;

public class SignupTests {

	@Test(priority = 1, groups = { "regression" })
	void signupByMail() {
		System.out.println("signup by email");
	}

	@Test(priority = 2, groups = { "regression" })
	void signupByFacebook() {
		System.out.println("signup by facebook");
	}

	@Test(priority = 3, groups = { "regression" })
	void signupByTwitter() {
		System.out.println("signup by twitter");
	}
}

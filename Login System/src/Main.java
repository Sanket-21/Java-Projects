
public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandPasswords = new IDandPasswords();
		
		LoginPage loginpage = new LoginPage(idandPasswords.getLoginInfo());
	}

}

import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		logininfo.put("Bro", "pizza");
		logininfo.put("Thar", "123");
		logininfo.put("Teknas", "abc");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
	
}

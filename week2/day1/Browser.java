package week2.day1;

public class Browser {
	
	public void launchBrowser(String browsername) {
		System.out.println(browsername);

	}
	public String loadUrl() {
		String a="Url loaded successfully";
		return a;

	}
	public static void main(String[] args) {
		
		Browser name =new Browser();
		name.launchBrowser("Chrome");
		name.loadUrl();
	}

}

package Assignment2;

public class Browser 
{
		
		public void launchBrowser(String browserName) 
		{
			System.out.println(browserName + " browser launched  successfully ");
		}
		public void loadUrl()
		{
			System.out.println("URL loaded successfully");
		}
		

		public static void main(String[] args) 
		{
			
			Browser br = new Browser();
			br.launchBrowser("Chrome");
			br.loadUrl();
			// TODO Auto-generated method stub

		}


}

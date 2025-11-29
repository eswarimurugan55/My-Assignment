package week3.day2;

	public class Safari extends Browser
	{
		public void readerMode() 
		{
			System.out.println(browsername + ":Turning on reader mode");
	    }

	    public void fullScreenMode() {
	        System.out.println(browsername + ":Opening fullscreen mode");
	    }

	    public static void main(String[] args) {

	        Safari safari = new Safari();
	        safari.browsername = "Safari";
	        safari.browserVersion = "20";

	        safari.openURL();
	        safari.navigateBack();
	        safari.readerMode();
	        safari.fullScreenMode();
	        safari.closeBrowser();
	    }

	}


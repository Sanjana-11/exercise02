package exercise02;

public class Main {
	public static void main(String[] args) {
		
		Browser browse = new Firefox();
		browse.whoAmI();
		
				
		Browser b = new GoogleChrome();
		((GoogleChrome) b).getVersionNumber();
		
		Browser tabOne = new GoogleChrome();
		Browser tabTwo = new Firefox();
		Browser tabThree = new Firefox();
		Browser tabFour = new GoogleChrome();
		Browser tabFive = new GoogleChrome();
		Browser[] allBrowsers = new Browser[5];

		allBrowsers[0] = tabOne;
		allBrowsers[1] = tabTwo;
		allBrowsers[2] = tabThree;
		allBrowsers[3] = tabFour;
		allBrowsers[4] = tabFive;

		int countGoogleChrome = 0;
		int countFirefox = 0;

		for (int i = 0; i < allBrowsers.length; i++) {
			if (allBrowsers[i] instanceof GoogleChrome)
				countGoogleChrome++;
			else
				countFirefox++;
		}
		System.out.println(countGoogleChrome);
		System.out.println(countFirefox);

		Browser browser = new Firefox();
		((Firefox) browser).addContainer("facebookContainer");
		((Firefox) browser).addContainer("Mails");
		((Firefox) browser).addContainer("PrivateBrowsing");
		((Firefox) browser).leaveContainer("PrivateBrowsing"); 
		String[] containers = ((Firefox) browser).viewAllContainers(); 
		for (int i = 0; i < containers.length; i++)
			System.out.println(containers[i]);
		
		

	}
}

package exercise02;

public class GoogleChrome extends Browser{
	
	boolean isLocationAccessible;
	boolean isCameraAccessible;
	boolean isMicrophoneAccessible;
    public final String versionNumber = "1.0";

    public GoogleChrome(){
		super();
	}
    
    public void whoAmI() {
		System.out.println("I am Google Chrome");
	}
    public void setPermissions(boolean isLocationAccessible) {
	    this.isLocationAccessible = isLocationAccessible;
	    this.isCameraAccessible = isLocationAccessible;
	    this.isMicrophoneAccessible = isLocationAccessible;
	  }
	
	public void setPermissions(boolean isLocationAccessible, boolean isCameraAccessible, boolean isMicrophoneAccessible) {
	    this.isLocationAccessible = isLocationAccessible;
	    this.isCameraAccessible = isCameraAccessible;
	    this.isMicrophoneAccessible = isMicrophoneAccessible;
	  }

}
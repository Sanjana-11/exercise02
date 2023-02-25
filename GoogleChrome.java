package exercise02;

public class GoogleChrome extends Browser{
	
	boolean isLocationAccessible;
	boolean isCameraAccessible;
	boolean isMicrophoneAccessible;
    String versionNumber = "1.0";
    
    public void getVersionNumber() {
    	System.out.println(versionNumber);
    	
    }

    public GoogleChrome(){
		super();
	}
    
    public void whoAmI() {
		System.out.println("I am Google Chrome");
	}
    public void setLocation(boolean isLocationAccessible) {
	    this.isLocationAccessible = isLocationAccessible;
	  }
    
    public void setCamera(boolean isCameraAccessible) {
    	this.isCameraAccessible = isCameraAccessible;
    }
    
    public void setMicrophone(boolean isMicrophoneAccessible) {
    	this.isMicrophoneAccessible = isMicrophoneAccessible;
    }
	
	public void setPermissions(boolean isLocationAccessible, boolean isCameraAccessible, boolean isMicrophoneAccessible) {
	    this.isLocationAccessible = isLocationAccessible;
	    this.isCameraAccessible = isCameraAccessible;
	    this.isMicrophoneAccessible = isMicrophoneAccessible;
	  }

}
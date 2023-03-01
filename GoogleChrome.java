package exercise02;

public class GoogleChrome extends Browser {

	boolean isLocationAccessible;
	boolean isCameraAccessible;
	boolean isMicrophoneAccessible;
	final String versionNumber = "1.0";

	public void getVersionNumber() {
		System.out.println(versionNumber);

	}

	public GoogleChrome() {
		super();
	}

	public void whoAmI() {
		System.out.println("I am Google Chrome");
	}

	public void setPermissions(String permissionType, boolean isAccessible) {
		if (permissionType.equalsIgnoreCase("location")) {
			this.isLocationAccessible = isAccessible;
		} else if (permissionType.equalsIgnoreCase("camera")) {
			this.isCameraAccessible = isAccessible;
		} else if (permissionType.equalsIgnoreCase("microphone")) {
			this.isMicrophoneAccessible = isAccessible;
		}
	}

	public void setPermissions(boolean isLocationAccessible, boolean isCameraAccessible, boolean isMicrophoneAccessible) {
		this.isLocationAccessible = isLocationAccessible;
		this.isCameraAccessible = isCameraAccessible;
		this.isMicrophoneAccessible = isMicrophoneAccessible;
	}

	public void showPermissions() {
		System.out.println("Location Accessible : " + isLocationAccessible);
		System.out.println("Camera Accessible : " + isCameraAccessible);
		System.out.println("Microphone Accessible : " + isMicrophoneAccessible);

	}

}
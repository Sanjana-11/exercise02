package exercise02;

import java.util.ArrayList;
import java.util.List;

public class Firefox extends Browser implements MultipleAccountContainers{
	
	public Firefox(){
		super();
	}
	
	public void whoAmI() {
		System.out.println("I am Firefox");
		super.whoAmI();

	}
	
	List<String> containerList = new ArrayList<>();
	
	public void addContainer(String containerName) {
		 containerList.add(containerName);
	}

	public void leaveContainer(String containerName) {
		 containerList.remove(containerName);
	} 
	
	public String[] viewAllContainers() {
		String[] containerArray = new String[containerList.size()];
        return containerList.toArray(containerArray);
    }	
	
}

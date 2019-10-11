package model;

import java.util.LinkedList;

import controller.rootController;
import model.Service.serviceType;

public class UserDataHandler {
	
	public static void loadUser(String selectedItem) {
		
		User userToShow = ExampleUserHandler.getUserByName(selectedItem);
		LinkedList<Account> tempAccounts = userToShow.getAccounts();
		LinkedList<Service.serviceType> usersAccounts = new LinkedList<Service.serviceType>();
		for (int i = 0; i < tempAccounts.size(); i++) {
			usersAccounts.add(tempAccounts.get(i).getService());
		}
		
		System.out.println("--------------Lade folgenden User");
		ExampleUserHandler.writeUserInfoInConsole(ExampleUserHandler.getUserByName(selectedItem));
		
		refreshButtons(usersAccounts.contains(serviceType.Auth0),
								usersAccounts.contains(serviceType.Subversion),
								usersAccounts.contains(serviceType.WLAN),
								usersAccounts.contains(serviceType.VPN),
								usersAccounts.contains(serviceType.NAS),
								usersAccounts.contains(serviceType.Git),
								usersAccounts.contains(serviceType.Timebutler),
								usersAccounts.contains(serviceType.Telefonanlage),
								usersAccounts.contains(serviceType.Slack),
								usersAccounts.contains(serviceType.AWS));
	}
	
	
	public static void refreshButtons(boolean hasAuth0,
									  boolean hasSubversion,
							   	      boolean hasWLAN,
								      boolean hasVPN,
								      boolean hasNAS,
								      boolean hasGit,
									  boolean hasTimebutler,
									  boolean hasTelefonanlage,
								      boolean hasSlack,
								      boolean hasAWS) {

		rootController.toggleButtonAuth0.setSelected(hasAuth0);
		rootController.toggleButtonSubversion.setSelected(hasSubversion);
		rootController.toggleButtonWLAN.setSelected(hasWLAN);
		rootController.toggleButtonVPN.setSelected(hasVPN);
		rootController.toggleButtonNAS.setSelected(hasNAS);
		rootController.toggleButtonGit.setSelected(hasGit);
		rootController.toggleButtonTimebutler.setSelected(hasTimebutler);
		rootController.toggleButtonTelefonanlage.setSelected(hasTelefonanlage);
		rootController.toggleButtonSlack.setSelected(hasSlack);
		rootController.toggleButtonAWS.setSelected(hasAWS);
	}
}


//Hier werden alle Services, Namen, Email etc vom User geladen und "verschickt"
//Verweis auf refreshbuttons in ActionWindowController fehlt
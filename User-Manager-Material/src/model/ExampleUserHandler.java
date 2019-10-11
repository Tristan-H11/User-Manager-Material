package model;

import java.util.Arrays;
import java.util.LinkedList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Service.serviceType;

public class ExampleUserHandler {

	static User hansMueller;
	static User sarahBertram;
	static User peterMeyer;
	static User karlNachname;
	
	static ObservableList<User> allUsers;
	
	//Dieses return liefert direkt in die Elemente des ListView
	public static ObservableList<User> getExampleUser() {
		return allUsers;
	}
	
	
	public static void createExampleUsers() {


		hansMueller = new User("Hans", 
							   "Müller", 
							   new LinkedList<>(Arrays.asList(new Account(serviceType.Git),
									   						  new Account(serviceType.WLAN),
									   						  new Account(serviceType.Subversion))));


		sarahBertram = new User("Sarah", 
								"Bertram", 
								new LinkedList<>(Arrays.asList(new Account(serviceType.AWS),
															   new Account(serviceType.Auth0),
															   new Account(serviceType.Subversion))));

		
		peterMeyer = new User("Peter", 
							  "Meyer", 
				              new LinkedList<>(Arrays.asList(new Account(serviceType.AWS),
											                 new Account(serviceType.Timebutler),
											                 new Account(serviceType.Slack))));
		
		
		karlNachname = new User("Karl", 
							    "Nachname", 
					            new LinkedList<>(Arrays.asList(new Account(serviceType.Git),
								     			               new Account(serviceType.Timebutler),
												               new Account(serviceType.Slack))));

		allUsers = FXCollections.observableArrayList(hansMueller, sarahBertram, peterMeyer, karlNachname);
		
		System.out.println("----------Folgende Benutzer wurde erstellt:");
		writeUserInfoInConsole(hansMueller);
		writeUserInfoInConsole(sarahBertram);
		writeUserInfoInConsole(peterMeyer);
		writeUserInfoInConsole(karlNachname);
	}

	
	
	public static void writeUserInfoInConsole(User name) {
		System.out.println("Vorname: " + name.getFirstName());
		System.out.println("Nachname: " + name.getLastName());
		System.out.println("Email: " + name.getEmail());
		System.out.println("Kürzel: " + name.getNameSymbol());
		System.out.println("Der Benutzer besitzt die folgenden Konten: ");
		for (int i = 0; i < name.getAccounts().size(); i++) {
			System.out.println("-" + name.getAccounts().get(i).getService().toString());
		}
		System.out.println();
		System.out.println();
	}

	public static User getUserByName(String name) {
		String completeName;
		for (int i = 0; i < allUsers.size(); i++) {
			completeName = allUsers.get(i).getFirstName() + " " + allUsers.get(i).getLastName();
			if(completeName.equals(name)) return allUsers.get(i);
		}
		return new User("","",new LinkedList<Account>()); //Es wird in der For schleife definitiv ein User gefunden. Was soll default zurückgegeben werden? Ungern null
	}
}

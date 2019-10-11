package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ExampleUserHandler;

public class UserListHandler {

	//Such sich aus ExampleUsers alle User, holt deren Vor und Nachnamen und gibt sie mit "Vorname Nachname" als ObservableArrayList<String> zurück
	public static ObservableList<String> getNamesForUserListView(){

		ObservableList<String> tempNames = FXCollections.observableArrayList();
		for (int i = 0; i < model.ExampleUserHandler.getExampleUser().size(); i++) {
			//Fügt der temporären Liste den Vornamen plus Leerzeichen plus Nachnamen des Users an stelle i hinzu
			tempNames.add(ExampleUserHandler.getExampleUser().get(i).getFirstName() + " " + ExampleUserHandler.getExampleUser().get(i).getLastName());
		/*
		 * 
		 * NullPointerException in tempNames.add(....)
		 * 
		 */
		
		
		
		}
		return tempNames;
	}
	
	
	public static ObservableList<String> getNamesUserListFiltered(String phrase) {

		ObservableList<String> userListFiltered = FXCollections.observableArrayList();

		for (int i = 0; i < getNamesForUserListView().size(); i++) {
			if (getNamesForUserListView().get(i).toLowerCase().contains(phrase.toLowerCase()))
				userListFiltered.add(getNamesForUserListView().get(i));
			// Er durchläuft die Liste an Namen. Falls ein Name die phrase enthält, wird
			// er der userListFiltered hinzugefügt.
		}

		return userListFiltered;
	}
	


}

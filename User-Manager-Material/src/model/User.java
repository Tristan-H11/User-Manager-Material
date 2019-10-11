package model;

import java.util.LinkedList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User{
	
	private StringProperty firstName = new SimpleStringProperty();
	private StringProperty lastName = new SimpleStringProperty();
	private String email;
	private String nameSymbol;
	private String completeName;
	private LinkedList<Account> accounts = new LinkedList<>();

	
	
	// Erstellt den Benuter mit allen nötigen Informationen
	public User(String firstName, String lastName, LinkedList<Account> linkedList) {
		
		//Prüfen, ob name vergeben ist
		this.firstName.set(firstName);
		this.lastName.set(lastName);
		this.accounts.addAll(linkedList);
		
		
		
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@set.de";
		
		//Check, ob das Kürzel schon vergeben ist. Falls nicht:
		this.nameSymbol = firstName.toCharArray()[0] + "" + lastName.toCharArray()[0];		
	}
	
	////////////////
	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	public StringProperty firstNameProperty() {
		return firstName;
	}

	
	////////////////
	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	public StringProperty lastNameProperty() {
		return lastName;
	}

	
	////////////////
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	////////////////
	public String getNameSymbol() {
		return nameSymbol;
	}

	public void setNameSymbol(String nameSymbol) {
		this.nameSymbol = nameSymbol;
	}

	
	////////////////
	public LinkedList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(LinkedList<Account> accounts) {
		this.accounts = accounts;
	}

	////////////////
	public String getCompleteName() {
		return firstName + " " + lastName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	



}
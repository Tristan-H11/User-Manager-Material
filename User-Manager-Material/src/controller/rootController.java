package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.ExampleUserHandler;
import model.User;
import model.UserDataHandler;
import model.UserListHandler;

public class rootController {



    @FXML
    private JFXButton addUserButton;

    @FXML
    private JFXTextField searchField;

    @FXML
    private JFXListView<String> userList;
    
    @FXML
    private ListView<JFXToggleButton> listViewToggleButtons;

    @FXML
    private JFXButton settingsButton;

    @FXML
    private JFXButton deleteUserButton;

    @FXML
    public static JFXToggleButton toggleButtonAuth0 = new JFXToggleButton() ;

    @FXML
    public static JFXToggleButton toggleButtonSubversion = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonWLAN = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonVPN = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonNAS = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonGit = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonTimebutler = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonTelefonanlage = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonSlack = new JFXToggleButton();

    @FXML
    public static JFXToggleButton toggleButtonAWS = new JFXToggleButton();
    
    @FXML
    void changeStateAWS(ActionEvent event) {
    }

    @FXML
    void changeStateAuth0(ActionEvent event) {

    }

    @FXML
    void changeStateGit(ActionEvent event) {

    }

    @FXML
    void changeStateNAS(ActionEvent event) {

    }

    @FXML
    void changeStateSlack(ActionEvent event) {

    }

    @FXML
    void changeStateSubversion(ActionEvent event) {

    }

    @FXML
    void changeStateTelefonanlage(ActionEvent event) {

    }

    @FXML
    void changeStateTimebutler(ActionEvent event) {

    }

    @FXML
    void changeStateVPN(ActionEvent event) {

    }

    @FXML
    void changeStateWLAN(ActionEvent event) {

    }
    
    @FXML
    void addUser(ActionEvent event) {

    }

    @FXML
    void deleteUser(ActionEvent event) {
    }

    @FXML
    void openSettings(ActionEvent event) {

    }


    
    @FXML
    void showUser(MouseEvent event) {
//    	
//		if (userList.getSelectionModel().getSelectedItem() != null)
//			UserDataHandler.loadUser(userList.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() {
    	ExampleUserHandler.createExampleUsers();
    	userList.setItems(model.UserListHandler.getNamesForUserListView());
    	searchField.setFocusTraversable(true);
    	

		
    	
    	//Listener wartet, bis sich der Text im Textfeld ändert und fordert dann mit newValue die gefilterte Liste an
    	searchField.textProperty().addListener(new ChangeListener<String>() {
    	    @Override
    	    public void changed(ObservableValue<? extends String> observable,
    	            String oldValue, String newValue) {

    	        userList.setItems(UserListHandler.getNamesUserListFiltered(newValue));
    	    }
    	});
    }
    

}

import java.net.URL;
import java.util.ResourceBundle;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MainViewController implements Initializable {

	@FXML// the list of all cocktails
	private ListView<String> cocktailList;


	@FXML// Detail of selected cocktail
	public Label cocktailInfo;

	@FXML
	public CheckBox vodkaCheckbox;
	@FXML
	public CheckBox whiskyCheckbox;
	@FXML
	public CheckBox rumCheckbox;
	@FXML
	public CheckBox ginCheckbox;
	@FXML
	public CheckBox kahluaCheckbox;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ObservableList<String> testList = FXCollections.observableArrayList("White Russian", "Whisky Sour", "Jack and Coke", "Sidecar", "Gimlet", "Martini");
		cocktailList.setItems(testList);

		/**
		 * Cocktail Detail Text
		 */
		cocktailInfo.setText("Cocktail name:  Coming soon\n Cocktail Ingredient: Some More Stuff\n How to Make it: Mix That Drink ");

		/**
		 * Clicking on cocktail from list
		 */
		cocktailList.setOnMouseClicked(new EventHandler<MouseEvent>() {
			   @Override
		        public void handle(MouseEvent event) {
				   //PUT COCKTAIL INFO HERE
		            System.out.println("clicked on " + cocktailList.getSelectionModel().getSelectedItem());
			   }
		});
	}

	public void checkBoxChecked() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if(vodkaCheckbox.isSelected()){
			  System.out.println("clicked on " + vodkaCheckbox.getText());
		}

		if(whiskyCheckbox.isSelected()){
			  System.out.println("clicked on " + whiskyCheckbox.getText());
		}

		if(ginCheckbox.isSelected()){
			  System.out.println("clicked on " + ginCheckbox.getText());
		}

		if(rumCheckbox.isSelected()){
			  System.out.println("clicked on " + rumCheckbox.getText());
		}

		if(kahluaCheckbox.isSelected()){
			  System.out.println("clicked on " + kahluaCheckbox.getText());
		}

	}



}
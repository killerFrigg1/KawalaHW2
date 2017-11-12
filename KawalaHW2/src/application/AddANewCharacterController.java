package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddANewCharacterController {
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField PESELTextField;
	@FXML
	private TextField heightTextField;
	@FXML
	private TextField professionTextField;
	@FXML
	private TextField raceTextField;
	@FXML
	private Button createANewCharacterButton;
	@FXML
	private Button CancelButton;

	@FXML
	private void createANewCharacterController() {
		SampleController.createANewCharacter(nameTextField.getText(), PESELTextField.getText(),
				Integer.parseInt(heightTextField.getText()), professionTextField.getText(), raceTextField.getText());
	}

	@FXML
	private void cancel() {
		Main.secondaryStage.close();
	}
}

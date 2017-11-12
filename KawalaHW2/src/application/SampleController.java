package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController {
	static ObservableList<Character> characters = FXCollections.observableArrayList();

	@FXML
	Button addButton;
	@FXML
	Button removeButton;
	@FXML
	TableView<Character> tableView;
	@FXML
	TableColumn<Character, String> nameColumn;
	@FXML
	TableColumn<Character, String> PESELColumn;
	@FXML
	TableColumn<Character, String> heightColum;
	@FXML
	TableColumn<Character, String> professionColumn;
	@FXML
	TableColumn<Character, String> raceColumn;

	public static ObservableList<Character> createANewCharacter(String name, String PESEL, int height,
			String profession, String race) {
		characters.add(new Character(name, PESEL, height, profession, race));
		Main.secondaryStage.close();
		return characters;
	}

	@FXML
	private void removeCharacter() {
		ObservableList<Character> charactersSelected;
		charactersSelected = tableView.getSelectionModel().getSelectedItems();
		characters.removeAll(charactersSelected);
	}

	public void initialize() {
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		PESELColumn.setCellValueFactory(new PropertyValueFactory<>("PESEL"));
		heightColum.setCellValueFactory(new PropertyValueFactory<>("height"));
		professionColumn.setCellValueFactory(new PropertyValueFactory<>("profession"));
		raceColumn.setCellValueFactory(new PropertyValueFactory<>("race"));
		tableView.setItems(characters);
	}

	@FXML
	public void addANewCharacterStageController() throws IOException {
		Main.addANewCharacterStage();
	}

}

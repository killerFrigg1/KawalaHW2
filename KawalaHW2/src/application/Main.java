package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage primaryStage;
	static Stage secondaryStage;
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Main.primaryStage = primaryStage;
		primaryStage.setTitle("Kawala, HW2");
		setMainLayout();
	}

	private void setMainLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Sample.fxml"));
		mainLayout = loader.load();
		primaryStage.setScene(new Scene(mainLayout));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void addANewCharacterStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddANewCharacter.fxml"));
		secondaryStage = new Stage();
		secondaryStage.initModality(Modality.WINDOW_MODAL);
		secondaryStage.initOwner(primaryStage);
		secondaryStage.setScene(new Scene(loader.load()));
		secondaryStage.setTitle("Dodaj nową postać");
		secondaryStage.showAndWait();
	}

}

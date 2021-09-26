package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        // INSTANTIATED FXMLLOADER TO MANIPULATE MainView BEFORE IT LOADS //
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
        ScrollPane scrollPane = loader.load();

        // TO AJUST SCROLLPANE TO THE WINDOW //

        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        mainScene = new Scene(scrollPane);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sample JavaFX application");
        primaryStage.show();
    }

    // TO USE SCENE AS A REFERENCE //
    public static Scene getMainScene(){
        return mainScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

    // THE ARGUMENT IS THE EVENT THAT A BUTTON RECIEVED //
    public static Stage currentStage(ActionEvent event){
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public static Integer tryParseToInt(String str){
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            return null;
        }
    }
}

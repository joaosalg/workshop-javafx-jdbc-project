package gui.util;

import javafx.scene.control.TextField;

public class Constraints {

    public static void setTextFieldInteger(TextField txt) {
        txt.textProperty().addListener((observableValue, oldValue, newValue) -> {
            // "\\d*" = REGULAR EXPRESSION THAT REPRESENTS INTEGERS //
            if (newValue != null && !newValue.matches("\\d*")){
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldMaxLength(TextField txt, int max) {
        txt.textProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue == null && newValue.length() > max ) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldDouble(TextField txt) {
        txt.textProperty().addListener((observableValue, oldValue, newValue) -> {
            // "\\d*([\\.]\\d*)?" = REGULAR EXPRESSION THAT REPRESENTS DOUBLES //
            if (newValue == null && !newValue.matches("\\d*([\\.]\\d*)?")){
                txt.setText(oldValue);
            }
        });
    }
}
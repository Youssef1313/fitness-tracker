package gui;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import simpleFitnessTracker.*;


public class AddActivityController {

    @FXML
    private RadioButton swimming;
    @FXML
    private RadioButton running;
    @FXML
    private RadioButton kickBoxing;
    @FXML
    private RadioButton strengthTraining;
    @FXML
    private TextField timeField;

    private Calculator calculator;

    public AddActivityController(Calculator calculator) {
        this.calculator = calculator;
    }

    public void add(MouseEvent mouseEvent) {
        int minutes = convertStringToInt(timeField.getText());
        if (minutes <= 0) return;

        if (swimming.isSelected()) {
            calculator.addActivity(new Swimming(minutes));
        }
        else if (running.isSelected()) {
            calculator.addActivity(new Running(minutes));
        }

        else if (kickBoxing.isSelected()) {
            calculator.addActivity(new KickBoxing(minutes));
        }
        else if (strengthTraining.isSelected()) {
            calculator.addActivity(new StrengthTraining(minutes));
        }
        else {
            return;
        }
        ((Stage) swimming.getScene().getWindow()).close();

    }

    private int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        }
        catch (Exception ex) {
            return -1;
        }
    }
}

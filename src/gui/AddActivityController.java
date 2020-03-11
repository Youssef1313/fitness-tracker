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
    private Activity lastAddedActivity;

    public AddActivityController(Calculator calculator) {
        this.calculator = calculator;
    }

    public void add(MouseEvent mouseEvent) {
        lastAddedActivity = getActivityToAdd();
        if (lastAddedActivity == null) return;
        calculator.addActivity(lastAddedActivity);
        ((Stage) swimming.getScene().getWindow()).close();

    }

    private Activity getActivityToAdd() {
        int minutes = convertStringToInt(timeField.getText());
        if (minutes <= 0) return null;

        if (swimming.isSelected()) {
            return new Swimming(minutes);
        }
        if (running.isSelected()) {
            return new Running(minutes);
        }
        if (kickBoxing.isSelected()) {
            return new KickBoxing(minutes);
        }
        if (strengthTraining.isSelected()) {
            return new StrengthTraining(minutes);
        }
        return null;
    }

    private int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        }
        catch (Exception ex) {
            return -1;
        }
    }

    public Activity getLastAddedActivity() {
        return lastAddedActivity;
    }
}

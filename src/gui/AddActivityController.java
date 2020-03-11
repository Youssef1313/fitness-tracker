package gui;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
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

    private Calculator calculator;

    public AddActivityController(Calculator calculator) {
        this.calculator = calculator;
    }

    public void add(MouseEvent mouseEvent) {
        if (swimming.isSelected()) {
            calculator.addActivity(new Swimming(5));
        }

        if (running.isSelected()) {
            calculator.addActivity(new Running(5));
        }

        if (kickBoxing.isSelected()) {
            calculator.addActivity(new KickBoxing(5));
        }

        if (strengthTraining.isSelected()) {
            calculator.addActivity(new StrengthTraining(5));
        }
        ((Stage)swimming.getScene().getWindow()).close();

    }
}

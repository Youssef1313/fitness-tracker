package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import simpleFitnessTracker.Calculator;
import simpleFitnessTracker.Swimming;

public class MainController {

    @FXML
    private Label totalBurntCalories;
    @FXML
    private Label totalHeartRate;
    @FXML
    private ListView activityList;
    private Calculator calculator;

    public void initialize() {
        calculator = new Calculator();
        refreshData();
    }

    private void refreshData() {
        totalBurntCalories.setText(String.valueOf(calculator.getBurntCalories()));
        totalHeartRate.setText(String.valueOf(calculator.getHeartRate()));
    }

    public void addActivityClicked() {
        activityList.getItems().add(new Swimming(5));
        refreshData();
    }

    public void sortClicked(MouseEvent mouseEvent) {
    }
}

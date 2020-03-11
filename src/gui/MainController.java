package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import simpleFitnessTracker.Calculator;

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

    public void addActivityClicked() throws Exception {
        Parent loader = FXMLLoader.load(getClass().getResource("addActivity.fxml"));
        //loader.setController(new AddActivityController(calculator));
        var addActivityStage = new Stage();
        addActivityStage.setTitle("Fitness Tracker - Add Activity");
        addActivityStage.setScene(new Scene(loader));
        addActivityStage.setResizable(false);
        addActivityStage.initModality(Modality.APPLICATION_MODAL);
        addActivityStage.showAndWait();
        refreshData();
    }

    public void sortClicked(MouseEvent mouseEvent) {

    }
}

package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import simpleFitnessTracker.ActivityResult;

import java.util.ArrayList;

public class SortedActivitiesController {
    @FXML
    private Label resultsLabel;

    private ArrayList<ActivityResult> results;

    public SortedActivitiesController(ArrayList<ActivityResult> results) {
        this.results = results;
    }

    public void initialize() {
        var builder = new StringBuilder();
        for (int i = 0; i < results.size(); i++) {
            ActivityResult activityResult = results.get(i);
            builder.append(i + 1).append(". ").append(activityResult.getActivityName()).append('\n');
            builder.append("\t Calories burnt: ").append(activityResult.getBurntCaloriesIncrease()).append(" calories\n");
            builder.append("\t Heart rate increase: ").append(activityResult.getHeartRateIncrease()).append(" beats/minute\n\n");
        }
        resultsLabel.setText(builder.toString());
    }
}

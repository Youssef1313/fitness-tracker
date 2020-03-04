package simpleFitnessTracker;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<ActivityResult> activityResults;
    private float heartRate;
    private int burntCalories;

    public Calculator() {
        this.activityResults = new ArrayList<ActivityResult>();
        heartRate = 80;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public int getBurntCalories() {
        return burntCalories;
    }

    public ActivityResult addActivity(Activity activity) {
        ActivityResult result = activity.calculateActivityResult(heartRate);
        heartRate += result.getHeartRateIncrease();
        burntCalories += result.getBurntCaloriesIncrease();
        activityResults.add(result);
        return result;
    }
}

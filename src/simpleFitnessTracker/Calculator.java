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

    public void addActivity(Activity activity) {
        ActivityResult result = activity.calculateActivityResult(heartRate);
        heartRate += result.getHeartRateIncrease();
        burntCalories += result.getBurntCaloriesIncrease();

        ActivityResult previousActivityResult = findActivityResultByName(result.getActivityName());
        if (previousActivityResult == null) {
            activityResults.add(result);
        }
        else {
            previousActivityResult.setBurntCaloriesIncrease(previousActivityResult.getBurntCaloriesIncrease() + result.getBurntCaloriesIncrease());
            previousActivityResult.setHeartRateIncrease(previousActivityResult.getHeartRateIncrease() + result.getHeartRateIncrease());
        }

    }

    public ArrayList<ActivityResult> sortActivityResults() {
        var clone = (ArrayList<ActivityResult>)activityResults.clone();
        clone.sort((o1, o2) -> {
            if (o1.getBurntCaloriesIncrease() == o2.getBurntCaloriesIncrease()) {
                return Float.compare(o2.getHeartRateIncrease(), o1.getHeartRateIncrease());
            }
            return Integer.compare(o2.getBurntCaloriesIncrease(), o1.getBurntCaloriesIncrease());
        });
        return clone;
    }

    private ActivityResult findActivityResultByName(String activityName) {
        for (ActivityResult activityResult : activityResults) {
            if (activityResult.getActivityName().equals(activityName)) return activityResult;
        }
        return null;
    }
    
}

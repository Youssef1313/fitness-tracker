package simpleFitnessTracker;

public class ActivityResult {
    private int burntCaloriesIncrease;
    private float heartRateIncrease;
    private String activityName;

    public ActivityResult(int burntCaloriesIncrease, float heartRateIncrease, String activityName) {
        this.burntCaloriesIncrease = burntCaloriesIncrease;
        this.heartRateIncrease = heartRateIncrease;
        this.activityName = activityName;
    }

    public void setBurntCaloriesIncrease(int burntCaloriesIncrease) {
        this.burntCaloriesIncrease = burntCaloriesIncrease;
    }

    public void setHeartRateIncrease(float heartRateIncrease) {
        this.heartRateIncrease = heartRateIncrease;
    }

    public int getBurntCaloriesIncrease() {
        return burntCaloriesIncrease;
    }

    public float getHeartRateIncrease() {
        return heartRateIncrease;
    }

    public String getActivityName() {
        return activityName;
    }
}

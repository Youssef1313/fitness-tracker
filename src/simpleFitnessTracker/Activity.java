package simpleFitnessTracker;

public abstract class Activity {
    private final int burntCaloriesPerMinute;
    private final float heartRateIncreasePerMinute;
    private final int timeInMinutes;

    public Activity(int burntCaloriesPerMinute, float heartRateIncreasePerMinute, int timeInMinutes) {
        this.burntCaloriesPerMinute = burntCaloriesPerMinute;
        this.heartRateIncreasePerMinute = heartRateIncreasePerMinute;
        this.timeInMinutes = timeInMinutes;
    }

    public int getBurntCaloriesPerMinute() {
        return burntCaloriesPerMinute;
    }

    public float getHeartRateIncreasePerMinute() {
        return heartRateIncreasePerMinute;
    }

    public ActivityResult calculateActivityResult(float oldHeartRate) {
        return new ActivityResult(calculateBurntCaloriesIncrease(),
                calculateHeartRateIncrease(oldHeartRate));
    }

    private int calculateBurntCaloriesIncrease() {
        return burntCaloriesPerMinute * timeInMinutes;
    }

    private float calculateHeartRateIncrease(float oldHeartRate) {
        return oldHeartRate * timeInMinutes * heartRateIncreasePerMinute / 100;
    }

}

package simpleFitnessTracker;

public class ActivityResult {
    private int burntCaloriesIncrease;
    private float heartRateIncrease;

    public ActivityResult(int burntCaloriesIncrease, float heartRateIncrease) {
        this.burntCaloriesIncrease = burntCaloriesIncrease;
        this.heartRateIncrease = heartRateIncrease;
    }

    public int getBurntCaloriesIncrease() {
        return burntCaloriesIncrease;
    }

    public float getHeartRateIncrease() {
        return heartRateIncrease;
    }
}

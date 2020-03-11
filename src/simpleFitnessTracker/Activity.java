package simpleFitnessTracker;

public abstract class Activity {
        private final int burntCaloriesPerMinute;
        private final float heartRateIncreasePerMinute;
        private final int timeInMinutes;
        private final String activityName;

        public Activity(int burntCaloriesPerMinute, float heartRateIncreasePerMinute, int timeInMinutes) {
            this.burntCaloriesPerMinute = burntCaloriesPerMinute;
            this.heartRateIncreasePerMinute = heartRateIncreasePerMinute;
            this.timeInMinutes = timeInMinutes;
            activityName = this.getClass().getSimpleName();
        }


        public ActivityResult calculateActivityResult(float oldHeartRate) {
            return new ActivityResult(calculateBurntCaloriesIncrease(),
                    calculateHeartRateIncrease(oldHeartRate), activityName);
        }

        private int calculateBurntCaloriesIncrease() {
            return burntCaloriesPerMinute * timeInMinutes;
        }

        private float calculateHeartRateIncrease(float oldHeartRate) {
            return oldHeartRate * timeInMinutes * heartRateIncreasePerMinute / 100;
        }

        @Override
        public String toString() {
            return String.format("Activity: %s, Time in minutes: %d", activityName, timeInMinutes);
        }
}

package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simpleFitnessTracker.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        var calculator = new Calculator();
        calculator.addActivity(new  Swimming(5));

        calculator.addActivity(new KickBoxing(8));

        calculator.addActivity(new  Swimming(4));

        calculator.addActivity(new Running(9));

        calculator.addActivity(new StrengthTraining(5));

        for (ActivityResult sortActivityResult : calculator.sortActivityResults()) {
            System.out.println(sortActivityResult.getBurntCaloriesIncrease() + " " + sortActivityResult.getHeartRateIncrease() + " " + sortActivityResult.getActivityName());

        }
        System.out.println(calculator.getBurntCalories() + "   " + calculator.getHeartRate());



        launch(args);

    }
}

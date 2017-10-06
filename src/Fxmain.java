import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class Fxmain extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    public void initCircles(Pane root) {
        CircleGenerator gen = new CircleGenerator();

        Line line = new Line(10, 10, 200, 200);
        Circle[] circle = new Circle[gen.circlearraysize];
        int[] randomeradius = new int[gen.circlearraysize];
        for (int i = 0; i < gen.circlearraysize; i++) {
            randomeradius[i] = gen.Min + (int) (Math.random() * ((gen.Max - gen.Min) + 1));}

            for (int i = 0; i < gen.circlearraysize; i++) {
            if (i==0){
                gen.y = randomeradius[i];}
            else {
                gen.y = gen.y + randomeradius[i] + randomeradius[i-1];
            }
            circle[i] = new Circle(gen.x, gen.y, randomeradius[i]);
                root.getChildren().addAll(circle[i]);
            }




        }



    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane root = new Pane();
        initCircles(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

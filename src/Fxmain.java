import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class Fxmain extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    public void initCircles(Pane root) {
        CircleGeneratorData gen = new CircleGeneratorData();


        Circle[] circle = new Circle[gen.circlearraysize];
        int[] randomeradius = new int[gen.circlearraysize];                                         //creating array with size from keyboard



        int sumofrad = 0;
        for (int i = 0; i < gen.circlearraysize; i++) {
            randomeradius[i] = gen.Min + (int) (Math.random() * ((gen.Max - gen.Min) + 1));         //creating array with random radiuses of our circles
            sumofrad = sumofrad + randomeradius[i] * 2 + 1;                                         //getting snowmen total length
        }

        for (int i = gen.circlearraysize; i > 0; i--) {                                             //drawing snowman
            gen.y = sumofrad - randomeradius[i - 1];
            sumofrad = sumofrad - randomeradius[i - 1] * 2 - 1;

            circle[i - 1] = new Circle(gen.x, gen.y, randomeradius[i - 1]);
            circle[i - 1].setStroke(gen.getRandom());                                               //drawing random color stroke
            circle[i - 1].setFill(Paint.valueOf("white"));
            root.getChildren().addAll(circle[i - 1]);
        }

        Circle[] head = new Circle[]{new Circle(gen.x - randomeradius[0] / 2.5, randomeradius[0] / 2, randomeradius[0] / 8),        //drawing 2 eyes and nose
                new Circle(gen.x + randomeradius[0] / 2.5, randomeradius[0] / 2, randomeradius[0] / 6),
                new Circle( gen.x, randomeradius[0] * 5 / 4, randomeradius[0] / 5)};
        for (int i = 0; i < head.length; i++) {
            head[i].setFill(Paint.valueOf("white"));
            head[i].setStroke(gen.getRandom());
            root.getChildren().addAll(head[i]);
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

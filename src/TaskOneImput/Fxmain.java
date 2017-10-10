package TaskOneImput;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class Fxmain extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    String color = "white";


    public void initCircles(Pane root) {

        TextField textFieldX = new TextField("enter munber of circles");
        textFieldX.setTranslateX(400);
        textFieldX.setTranslateY(10);
        TextField textFieldMin = new TextField("enter the smallest radius");
        textFieldMin.setTranslateX(400);
        textFieldMin.setTranslateY(40);
        TextField textFieldMax = new TextField("enter the biggest radius");
        textFieldMax.setTranslateX(400);
        textFieldMax.setTranslateY(70);

        Button buttonRed = new Button("Make all circles red");
        buttonRed.setTranslateX(600);
        buttonRed.setTranslateY(40);
        buttonRed.setTextFill(Paint.valueOf("red"));
        buttonRed.setOnMouseClicked(event -> color = "red");

        Button button = new Button("accept data");
        button.setTranslateX(600);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                int circlearraysize = Integer.parseInt(textFieldX.getText());
                int Min = Integer.parseInt(textFieldMin.getText());
                int Max = Integer.parseInt(textFieldMax.getText());
                int x = Max;
                int y;
                Circle[] circle = new Circle[circlearraysize];
                int[] randomeradius = new int[circlearraysize];                                         //creating array with size from keyboard

                int sumofrad = 0;
                for (int i = 0; i < circlearraysize; i++) {
                    randomeradius[i] = Min + (int) (Math.random() * ((Max - Min) + 1));         //creating array with random radiuses of our circles
                    sumofrad = sumofrad + randomeradius[i] * 2 + 1;                                         //getting snowmen total length
                }

                for (int i = circlearraysize; i > 0; i--) {                                             //drawing snowman
                    y = sumofrad - randomeradius[i - 1];
                    sumofrad = sumofrad - randomeradius[i - 1] * 2 - 1;

                    circle[i - 1] = new Circle(x, y, randomeradius[i - 1]);
                    circle[i - 1].setStroke(getRandom());                                               //drawing random color stroke
                    circle[i - 1].setFill(Paint.valueOf(color));
                    root.getChildren().addAll(circle[i - 1]);
                }
             /*   paintRed(root);
                for (int i = 0; i < circlearraysize; i++) {
                    paintRed(root);
                    circle [i].setFill(Paint.valueOf(color));
                }
*/
                Circle[] head = new Circle[]{new Circle(x - randomeradius[0] / 2.5, randomeradius[0] / 2, randomeradius[0] / 8),        //drawing 2 eyes and nose
                        new Circle(x + randomeradius[0] / 2.5, randomeradius[0] / 2, randomeradius[0] / 6),
                        new Circle(x, randomeradius[0] * 5 / 4, randomeradius[0] / 5)};
                for (int i = 0; i < head.length; i++) {
                    head[i].setFill(Paint.valueOf(color));
                    head[i].setStroke(getRandom());
                    root.getChildren().addAll(head[i]);
                }


            }
        });

        root.getChildren().addAll(textFieldX, textFieldMax, textFieldMin, button, buttonRed);
    }


    public static Color getRandom() {
        Random r = new Random();                                        //creating color randomization
        return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }
/*
    public void paintRed (Pane root){
        Button buttonRed = new Button("Make all circles red");
        buttonRed.setTranslateX(600);
        buttonRed.setTranslateY(40);
        buttonRed.setTextFill(Paint.valueOf("red"));
        buttonRed.setOnMouseClicked(event -> color = "red");
        root.getChildren().addAll(buttonRed);
    }
*/


    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane root = new Pane();
        initCircles(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

    }
}

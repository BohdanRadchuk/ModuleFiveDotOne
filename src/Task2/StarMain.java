package Task2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class StarMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void initStar(Pane root){
        StarData sd = new StarData();
        sd.pointsInit();
        for (int i = 1; i<10; i++) {
            Line line = new Line(sd.stardotsx[i - 1], sd.stardotsy[i - 1], sd.stardotsx[i], sd.stardotsy[i]);       //drawing 9 lines
            root.getChildren().addAll(line);
        }
        Line lineend = new Line(sd.stardotsx[0], sd.stardotsy[0], sd.stardotsx[9], sd.stardotsy[9]);                //drawing finishing line
        root.getChildren().addAll(lineend);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        initStar(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

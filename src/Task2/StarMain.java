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
        /*for (int i = 1; i<10; i++) {
            Line line = new Line(sd.stardotsx[i - 1], sd.stardotsy[i - 1], sd.stardotsx[i], sd.stardotsy[i]);
            root.getChildren().addAll(line);
        }
*/
            Line lineend = new Line(sd.stardotsx[0], sd.stardotsy[0], sd.stardotsx[1], sd.stardotsy[1]);
        Line lineend1 = new Line(sd.stardotsx[1], sd.stardotsy[1], sd.stardotsx[6], sd.stardotsy[6]);
        Line lineend2 = new Line(sd.stardotsx[6], sd.stardotsy[6], sd.stardotsx[3], sd.stardotsy[3]);
        Line lineend3 = new Line(sd.stardotsx[3], sd.stardotsy[3], sd.stardotsx[2], sd.stardotsy[2]);
        Line lineend4 = new Line(sd.stardotsx[2], sd.stardotsy[2], sd.stardotsx[5], sd.stardotsy[5]);
        Line lineend5 = new Line(sd.stardotsx[5], sd.stardotsy[5], sd.stardotsx[8], sd.stardotsy[8]);

        root.getChildren().addAll(lineend,lineend1,lineend2,lineend3,lineend4,lineend5);


        sd.show();


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

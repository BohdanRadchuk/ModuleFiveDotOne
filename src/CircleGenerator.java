import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.Scanner;

public class CircleGenerator {
    static int x;
    int y;
    int circlearraysize;
    int randomeradius;
    int Min;
    int Max;
    Scanner scanner = new Scanner(System.in);

    public CircleGenerator (){
        System.out.println("enter amount of circles");
        this.circlearraysize = scanner.nextInt();
        System.out.println("enter minimal circle radius");
        this.Min = scanner.nextInt();
        System.out.println("enter maximal circle radius");
        this.Max = scanner.nextInt();

        this.x = Max;
    }

}

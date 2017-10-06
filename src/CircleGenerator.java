import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.Random;
import java.util.Scanner;

public class CircleGenerator {
/*
    Random rand = new Random();
    public void randomColor () {
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

    }
*/


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

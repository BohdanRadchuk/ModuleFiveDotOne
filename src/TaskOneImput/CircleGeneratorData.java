package TaskOneImput;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Random;
import java.util.Scanner;

public class CircleGeneratorData {

    static int x;                                               //x=static
    int y;
    int circlearraysize;

    int Min;
    int Max;

    Scanner scanner = new Scanner(System.in);


    public CircleGeneratorData(int x,int min, int max, Pane root){                                  //setting our data from keyboard
        System.out.println("enter amount of circles");
        this.circlearraysize = x;
        System.out.println("enter minimal circle radius");
        this.Min = min;
        System.out.println("enter maximal circle radius");
        this.Max = max;

        this.x = Max;
    }

    private static  Random r = new Random();

    public static Color getRandom() {                                               //creating color randomization
            return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
        }


}

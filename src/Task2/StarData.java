package Task2;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.StrictMath.cos;

public class StarData {
    int radius;
    int centerx;
    int centery;
    double smallradius;
    double [] stardotsx = new double[10];
    double [] stardotsy = new double[10];


    public StarData() {
        System.out.println("enter x & y of the star center");
        Scanner scanner= new Scanner(System.in);
        this.centerx = scanner.nextInt();
        this.centery = scanner.nextInt();
        System.out.println("enter radius of the star");
        this.radius = scanner.nextInt();
        this.smallradius = radius/2.57;
        double tempx;
        double tempy;

    }


    public void pointsInit(){



        stardotsx [0] =  centerx;
        stardotsy [0] = centery - radius;
        for (int i = 1; i <10;i ++) {                                   //creating 10 points
            if (i % 2 == 0) {                                           // creating 5 points of bigradius
                stardotsx[i] = centerx - cos((90 + 72 * i) * (PI / 180)) * radius;
                stardotsy[i] = centery - sin((90 + 72 * i) * (PI / 180)) * radius;
            } else {                                                                            //creating 5 points with swamm radius
                stardotsx[i] = centerx - cos((90 + 36 * i) * (PI / 180)) * smallradius;
                stardotsy[i] = centery - sin((90 + 36 * i) * (PI / 180)) * smallradius;
            }
        }
        double tempx = stardotsx [2];               //swaping points position
        double tempy = stardotsy [2];
        stardotsx [2] = stardotsx [6];
        stardotsy [2] = stardotsy [6];

        double tempx1 = stardotsx [4];
        double tempy1 = stardotsy [4];
        stardotsx [4] = tempx;
        stardotsy [4] = tempy;
        tempx = stardotsx [8];
        tempy = stardotsy [8];
        stardotsx [8] = tempx1;
        stardotsy [8] = tempy1;
        stardotsx [6] = tempx;
        stardotsy [6] = tempy;




    }

}
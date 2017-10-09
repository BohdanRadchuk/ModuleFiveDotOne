package Task2;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
import static java.lang.StrictMath.cos;

public class StarData {
    int radius = 100;
    int centerx = 100;
    int centery = 100;
    double smallradius;
    double [] stardotsx = new double[10];
    double [] stardotsy = new double[10];


    public StarData() {
        /*System.out.println("enter x & y of the star center");
        Scanner scanner= new Scanner(System.in);
        this.centerx = scanner.nextInt();
        this.centery = scanner.nextInt();
        System.out.println("enter radius of the star");
        this.radius = scanner.nextInt();
        */this.smallradius = radius/2.57;

    }


    public void pointsInit(){



        stardotsx [0] =  centerx;
        stardotsy [0] = centery - radius;
        for (int i = 1; i <10;i ++) {
            if (i % 2 == 0) {
                stardotsx[i] = centerx - cos((90 + 72 * i) * (PI / 180)) * radius;
                stardotsy[i] = centery - sin((90 + 72 * i) * (PI / 180)) * radius;
            } else {
                stardotsx[i] = centerx - cos((90 + 36 * i) * (PI / 180)) * smallradius;
                stardotsy[i] = centery - sin((90 + 36 * i) * (PI / 180)) * smallradius;
            }
        }
        /*stardotsx [1] = centerx + cos(18 * (PI / 180) ) * radius;
        stardotsy [1] = centery - sin( 18 * (PI / 180)) * radius;
        stardotsx [2] = centerx + sin (36* (PI / 180) ) * radius;
        stardotsy [2] = centery + cos(36 * (PI / 180)) * radius;
        stardotsx [3] = centerx - sin(36 * (PI / 180)) * radius;
        stardotsy [3] = centery  + cos(36 * (PI / 180)) * radius;
        stardotsx [4] = centery - cos(18 * (PI / 180)) * radius;
        stardotsy [4] = centery - sin(18 * (PI / 180)) * radius;




        stardotsx [5] = centerx - cos(36 * (PI/180)) *smallradius;
        stardotsy [5] = centery + sin(36 *(PI/180)) *smallradius;
        stardotsx [6] = centerx + cos(36 * (PI/180)) *smallradius;
        stardotsy [6] = centery + sin(36 *(PI/180)) *smallradius;
        stardotsx [7] = centerx;
        stardotsy [7] = centery + smallradius;
*/



    }
    public void  show(){
        System.out.println("point0" + stardotsx[1]);
    }
}
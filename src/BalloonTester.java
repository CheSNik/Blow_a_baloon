import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

/**
 * Assignment 3 program 4.24
 * @author Sergei Chekhonin
 * This program blows a baloon
 */

public class BalloonTester {

    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter("Assignment3_p4.24output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Baloon baloon = new Baloon(out);
        baloon.addAir(100);
        baloon.getVolume();
        out.println("Expected: 100");
        baloon.getSurfaceArea();
        out.println("Expected: 104.17");
        baloon.getRadius();
        out.println("Expected: 2.88");

        baloon.addAir(100);
        baloon.getVolume();
        out.println("Expected: 200");
        baloon.getSurfaceArea();
        out.println("Expected: 165.36");
        baloon.getRadius();
        out.println("Expected: 3.63");



        out.close();
    }
}

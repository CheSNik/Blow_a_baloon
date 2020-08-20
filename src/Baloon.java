import java.io.PrintWriter;

public class Baloon {

    private static final double PI = 3.14;
    private double _airVolume;
    private double _radius;
    private double _surfaceSquare;
    private PrintWriter _out;

    public Baloon(PrintWriter out) {
        _airVolume = 0;
        _surfaceSquare = 0;
        _out=out;
        _out.println("Created new baloon");
    }

    /***
     *
     * @param amount given amount of air
     */
    void addAir(double amount) {
        _airVolume+=amount;
        _radius= Math.cbrt(3*_airVolume/(4*PI));
        _out.printf("\nAdded: %.2f cm3 of air\n", amount);
    }

    /***
     * @return gets the current volume
     */
    double getVolume() {
        _out.printf("Baloon volume is: %.2f cm3 of air\n", _airVolume);
        return _airVolume;
    }

    /***
     * @return Gets the current surface area
     */
    double getSurfaceArea()  {
        _surfaceSquare=4*PI*_radius*_radius;
        _out.printf("Surface area is: %.2f cm2\n", _surfaceSquare);
        return _surfaceSquare;
    }

    /***
     * @return gets the current radius
     */
    double getRadius() {
        _out.printf("Radius is: %.2f cm\n", _radius);
        return _radius;
    }
}

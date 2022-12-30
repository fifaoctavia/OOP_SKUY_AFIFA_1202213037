
public class calculation implements Runnable {
    private double radius, side, area;
    private final double phi = 3.14;
    
    public double getradius() {
        return radius;
    }
    public double getside() {
        return side;
    }
    public double getarea() {
        return area;
    }
    public double getphi() {
        return phi;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }
    public void setside(double side) {
        this.side = side;
    }
    public void setarea(double area) {
        this.area = area;
    }

    // SQUARE
    public void setsquare(double side) throws IllegalArgumentException {
        if (side < 1) {
          throw new IllegalArgumentException("Must greater than 1!!");
        } this.area = side * side;
    }
    public double getsquare() {
        return this.area;
    }

    //CIRCLE
    public void setcircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
          throw new IllegalArgumentException("Must greater than 1!!");
        } this.area = phi * radius * radius;
    }
    public double getcircle() {
        return this.area;
    }

    //TRAPESIUM
    public void settrapesium(double atas, double bawah, double tinggi) throws IllegalArgumentException {
        if (atas < 1) {
            throw new IllegalArgumentException("Must greater than 1")
        }
        if (bawah < 1) {
            throw new IllegalArgumentException("Must greater than 1")
        }
        if (tinggi < 1) {
            throw new IllegalArgumentException("Must greater than 1")
        } this.area = 0.5 * ((atas + bawah) * tinggi);
    }
    public double gettrapesium() {
        return this.area;
    }

    @Override
    public void run() {
        System.out.println("\n-------Program will start in-------");
        for (int hit = 3; hit > 0; hit--) {
            try {
                System.out.println("Output appears in the count of "+hit);
                Thread.sleep(800);
            } catch (InterruptedException error) {
                System.out.println("ERROR!!");
            }
        }
    }
}

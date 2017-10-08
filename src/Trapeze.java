public class Trapeze extends Figure {
    private int baseA;
    private int baseB;
    private int sideC;
    private int sideD;
    private double angleBetweenSidesCA;
    private double angleBetweenSidesCB;
    private double angleBetweenSidesDA;
    private double angleBetweenSidesDB;

    public Trapeze(int baseA, int baseB, int sideC, int sideD, double angleBetweenSidesCA, double angleBetweenSidesDA){
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.angleBetweenSidesCA = angleBetweenSidesCA;
        angleBetweenSidesCB = Math.PI - angleBetweenSidesCA;
        this.angleBetweenSidesDA = angleBetweenSidesDA;
        angleBetweenSidesDB = Math.PI - angleBetweenSidesDA;
    }

    @Override
    public int findArea() {
        return (int)Math.round(middleLine() * findHeight());
    }

    @Override
    public String toString(){
    return "Трапеция." +
            " Длина оснований: " + baseA + ", " + baseB  + "." +
            " Длина боковых сторон: " + sideC + ", " + sideD  + "." +
            " Углы в радианах: " + angleBetweenSidesCA + ", " + angleBetweenSidesCB + ", " + angleBetweenSidesDA + ", " + angleBetweenSidesDB + ".";}

    public int findPerimeter() {
        return baseA + baseB + sideC + sideD;
    }
    public int middleLine() {
        return (baseA + baseB) / 2;
    }
    public double findHeight() {
        return sideC * Math.sin(angleBetweenSidesCA);
    }
}

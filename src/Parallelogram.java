public class Parallelogram extends Figure{
    private int sideA;
    private int sideB;
    private double angle1;
    private double angle2;

    public Parallelogram(int sideA, int sideB, double angle1){
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle1 = angle1;
        angle2 = Math.PI - angle1;
    }

    @Override
    public int findArea() {
        return (int)Math.round(sideA * sideB * Math.sin(angle1));
    }

    @Override
    public String toString(){
        return "Параллелограмм. Длина сторон: " + sideA + ", " + sideB + "." +
                " Углы в радианах: "  + angle1 + ", " + angle2 + "." ;
    }

    public int findPerimeter() {
        return (sideA + sideB) * 2;
    }

    public double findDiagonal(double angle) {
        return cosineTheorem(sideA, sideB, angle);
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public double getAngle1() {
        return angle1;
    }
    public double getAngle2() {
        return angle2;
    }
}

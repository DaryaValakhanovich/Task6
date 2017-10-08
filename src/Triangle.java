public class Triangle extends Figure implements RadiusOfInscribedCircle, RadiusOfCircumscribedCircle{
    private double sideA;
    private double sideB;
    private double sideC;
    private double angleAgainstSideA;
    private double angleAgainstSideB;
    private double angleAgainstSideC;

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        angleAgainstSideA = cosineTheoremForAngles(sideA, sideB, sideC);
        angleAgainstSideB = cosineTheoremForAngles(sideB, sideC, sideA);
        angleAgainstSideC = cosineTheoremForAngles(sideC, sideA, sideB);
    }
    public Triangle(int sideA, int sideB, double angleAgainstSideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAgainstSideC = angleAgainstSideC;
        sideC = cosineTheorem(sideA, sideB, angleAgainstSideC);
        angleAgainstSideB = cosineTheoremForAngles(sideB, sideA, sideC);
        angleAgainstSideA = 2 * Math.PI - angleAgainstSideB - angleAgainstSideC;
    }
    public Triangle(int sideA, double angleAgainstSideB, double angleAgainstSideC){
        this.sideA = sideA;
        this.angleAgainstSideB = angleAgainstSideB;
        this.angleAgainstSideC = angleAgainstSideC;
        angleAgainstSideA = 2 * Math.PI - angleAgainstSideB - angleAgainstSideA;
        sideB = sineTheorem(angleAgainstSideB, sideA, angleAgainstSideA);
        sideC = sineTheorem(angleAgainstSideC, sideA, angleAgainstSideA);
    }

    @Override
    public int findArea() {
        return (int)Math.round(findHeight(sideA, angleAgainstSideB) * sideC / 2);
    }
    @Override
    public double findRadiusOfInscribedCircle() {
        return Math.sqrt((findSemiPerimeter() - getSideA()) * (findSemiPerimeter() - getSideB()) * (findSemiPerimeter() - sideC) / findSemiPerimeter());
    }
    @Override
    public double findRadiusOfCircumscribedCircle(){
        return getSideA() / Math.sin(angleAgainstSideA);
    }

    @Override
    public String toString(){
        return "Треугольник." +
                " Длина сторон: " + sideA + ", " + sideB + ", " + sideC + "." +
                " Углы в радианах: " + angleAgainstSideA + ", " + angleAgainstSideB + ", " + angleAgainstSideC + ".";
    }

    public double findMiddleLine(double side) {
        return side/2;
    }
    public double findHeight(double sideA, double angleAgainstSideB){
        return sideA * Math.sin(angleAgainstSideB);
    }
    public int findPerimeter() {
        return (int)Math.abs(getSideA() + getSideB() + getSideC());
    }
    public int findSemiPerimeter() {
        return findPerimeter() / 2;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
}

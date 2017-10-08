public class Rhombus extends Parallelogram implements RadiusOfInscribedCircle {
    public Rhombus(int side, double angle){
        super(side, side, angle);
    }

    @Override
    public double findRadiusOfInscribedCircle() {
        return findDiagonal(getAngle1()) * findDiagonal(getAngle2()) / 4 / getSideA();
    }

    @Override
    public String toString(){
        return "Ромб. Длина стороны: " + getSideA() + "." +
        " Углы в радианах: "  + getAngle1() + ", " + getAngle2()+ ".";
    }

    public double findHeight() {
        return getSideA() * Math.sin(getAngle1());
    }
}


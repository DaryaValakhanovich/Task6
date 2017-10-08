public class Rectangle extends Parallelogram implements RadiusOfCircumscribedCircle {
    public Rectangle(int sideA, int sideB){
        super(sideA, sideB, Math.PI/2);
    }

    @Override
    public int findArea() {
        return (int)Math.round(getSideA() * getSideB());
    }
    @Override
    public double findRadiusOfCircumscribedCircle(){
        return findDiagonal(getAngle1())/2;
    }

    @Override
    public String toString(){
        return "Прямоугольник. Длина сторон: " + getSideA() + ", " + getSideB() + ".";
    }

    public double findDiagonal() {
        return theoremPythagorean(getSideA(), getSideB());
    }
}

public class Square extends Rectangle{
    public Square(int sideA){
        super(sideA, sideA);
    }

    @Override
    public String toString(){
        return "Квадрат. Длина стороны: " + getSideA() + ".";
    }

    public double findRadiusOfInscribedCircle(){
        return getSideA()/2;
    }
}


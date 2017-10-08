public abstract class Figure {
    public abstract int findArea();

    public double cosineTheorem(double sideA, double sideB, double angleAgainstSideC){
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(angleAgainstSideC));
    }
    public double cosineTheoremForAngles(double side, double sideA, double sideB){
        return Math.acos(-(Math.pow(side, 2) - Math.pow(sideA, 2) - Math.pow(sideB, 2)) / 2 / sideA / sideB);
    }
    public double sineTheorem(double angleAgainstSide, double sideA, double angleAgainstSideA){
        return sideA / Math.sin(angleAgainstSideA) * Math.sin(angleAgainstSide);
    }
    public double theoremPythagorean(double a, double b){return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));}
    public  boolean areaComparison(Figure figure){
        return findArea() == figure.findArea();
    };
}

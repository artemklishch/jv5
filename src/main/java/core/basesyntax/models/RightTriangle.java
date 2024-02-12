package core.basesyntax.models;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        double value = (double) (firstLeg * secondLeg) / 2;
        System.out.println(value);
        return value;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea()
                + ", first leg: "
                + firstLeg
                + ", second leg: "
                + secondLeg
                + ", color: "
                + color);
    }
}
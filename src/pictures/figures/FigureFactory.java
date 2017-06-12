package pictures.figures;

/**
 * Created by UserPc on 10.06.2017.
 */
public class FigureFactory {
    public Figure getFigure(String figureType) {
        if (figureType == null) {
            return null;
        }
        if (figureType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (figureType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (figureType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}

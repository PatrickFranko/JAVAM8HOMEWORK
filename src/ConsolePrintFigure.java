public class ConsolePrintFigure implements ShapePrinter{
    @Override
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }
}

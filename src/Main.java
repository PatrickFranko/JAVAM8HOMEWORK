//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();
        Quad quad = new Quad();
        Upright upright = new Upright();

        ShapePrinter s = new ConsolePrintFigure();
        s.print(circle);
        s.print(triangle);
        s.print(rhombus);
        s.print(quad);
        s.print(upright);
        }

}

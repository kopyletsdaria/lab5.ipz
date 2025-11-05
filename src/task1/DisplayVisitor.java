package task1;
/**
 * Нова операціz Display
 */
public class DisplayVisitor implements NetworkVisitor
{

    @Override
    public void visit(Network network)
    {
        System.out.println("Метод visit(task1.Network) з параметрами...(операція Display)");
    }

    @Override
    public void visit(Server server)
    {
        System.out.println("Метод visit(task1.Server) з параметрами...(операція Display)");
    }

    @Override
    public void visit(Workstation workstation)
    {
        System.out.println("Метод visit(task1.Workstation) з параметрами...(операція Display)");
    }

    @Override
    public void visit(Cable cable)
    {
        System.out.println("Метод visit(task1.Cable) з параметрами...(операція Display)");
    }
}
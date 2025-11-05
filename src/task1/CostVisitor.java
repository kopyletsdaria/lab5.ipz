package task1;
/**
 * ConcreteElement для розрахунку кошторису
 */

public class CostVisitor implements NetworkVisitor
{
    private double totalCost = 0;

    // Метод буде викликано, коли ми відвідаємо task1.Network
    @Override
    public void visit(Network network)
    {
        System.out.println("Метод visit(task1.Network) з параметрами...(розрахунок кошторису)");
        totalCost += 50;
    }

    // Метод буде викликано, коли ми відвідаємо task1.Server
    @Override
    public void visit(Server server)
    {
        System.out.println("Метод visit(task1.Server) з параметрами...(розрахунок кошторису)");
        totalCost += 1000;
    }

    @Override
    public void visit(Workstation workstation)
    {
        System.out.println("Метод visit(task1.Workstation) з параметрами...(розрахунок кошторису)");
        totalCost += 300;
    }

    @Override
    public void visit(Cable cable)
    {
        System.out.println("Метод visit(task1.Cable) з параметрами...(розрахунок кошторису)");
        totalCost += 20;
    }

    public double getTotalCost()
    {
        return totalCost;
    }
}
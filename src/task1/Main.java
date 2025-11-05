package task1;
/**
 * Демонстрація
 */

public class Main
{
    public static void main(String[] args)
    {
        Network mainNetwork = new Network();
        mainNetwork.add(new Server());
        mainNetwork.add(new Workstation());

        Network subNetwork = new Network();
        subNetwork.add(new Workstation());
        subNetwork.add(new Cable());

        mainNetwork.add(subNetwork);
        mainNetwork.add(new Cable());

        System.out.println("Запуск task1.CostVisitor(розрахунок кошторису)...");
        CostVisitor costVisitor = new CostVisitor();
        mainNetwork.accept(costVisitor);
        System.out.println("Загальна вартість: " + costVisitor.getTotalCost());

        System.out.println("\nЗапуск task1.DisplayVisitor(нова операція)...");
        DisplayVisitor displayVisitor = new DisplayVisitor();
        mainNetwork.accept(displayVisitor);
    }
}
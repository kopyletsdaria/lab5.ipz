package task1;
/**
 * Інтерфейс Visitor
 */

public interface NetworkVisitor
{
    void visit(Network network);
    void visit(Server server);
    void visit(Workstation workstation);
    void visit(Cable cable);
}
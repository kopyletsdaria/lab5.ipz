package task1;
/**
 * ConcreteElement
 */

public class Workstation implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
    }
}
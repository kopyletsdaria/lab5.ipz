package task1;
/**
 * ConcreteElement
 */

public class Cable implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
    }
}
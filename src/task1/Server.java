package task1;
/**
 * ConcreteElement
 */

public class Server implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        //"Передає себе"(this) у метод visit()
        visitor.visit(this);
    }
}

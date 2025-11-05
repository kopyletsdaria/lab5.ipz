package task1;

import java.util.ArrayList;
import java.util.List;
/**
 * ConcreteElement
 */

public class Network implements NetworkElement
{
    private List<NetworkElement> elements = new ArrayList<>();

    public void add(NetworkElement element)
    {
        elements.add(element);
    }

    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
        for (NetworkElement element : elements)
        {
            element.accept(visitor);
        }
    }
}
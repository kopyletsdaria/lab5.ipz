package task1;
/**
 * Element у термінах паттерна Visitor
 */

public interface NetworkElement
{
    void accept(NetworkVisitor visitor);
}
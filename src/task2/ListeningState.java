package task2;
/**
 * ConcreteState
 */

public class ListeningState implements ConnectionState
{

    @Override
    public void open(TCPConnection connection)
    {
        System.out.println("ListeningState: отримано запит на з'єднання...");
        connection.setState(new EstablishedState());
    }

    @Override
    public void close(TCPConnection connection)
    {
        System.out.println("ListeningState: закриття з'єднання...");
        connection.setState(new ClosedState());
    }

    @Override
    public void send(TCPConnection connection, String data)
    {
        System.out.println("Помилка: не можна відправляти дані у стані LISTENING");
    }

    @Override
    public void receive(TCPConnection connection) {
        System.out.println("ListeningState: очікування даних...");
    }
}
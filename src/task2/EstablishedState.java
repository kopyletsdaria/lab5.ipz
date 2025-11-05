package task2;
/**
 * ConcreteState
 */

public class EstablishedState implements ConnectionState
{

    @Override
    public void open(TCPConnection connection)
    {
        System.out.println("Помилка: з'єднання вже встановлено");
    }

    @Override
    public void close(TCPConnection connection)
    {
        System.out.println("EstablishedState: закриття з'єднання...");
        connection.setState(new ClosedState());
    }

    @Override
    public void send(TCPConnection connection, String data)
    {
        System.out.println("EstablishedState: відправка даних:[" + data + "]");
    }

    @Override
    public void receive(TCPConnection connection)
    {
        System.out.println("EstablishedState: отримання даних...");
    }
}
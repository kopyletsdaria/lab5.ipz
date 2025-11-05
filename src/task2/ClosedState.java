package task2;
/**
 * ConcreteState
 */

public class ClosedState implements ConnectionState
{

    @Override
    public void open(TCPConnection connection)
    {
        System.out.println("ClosedState: повторне відкриття з'єднання...");
        connection.setState(new ListeningState());
    }

    @Override
    public void close(TCPConnection connection)
    {
        System.out.println("Помилка: з'єднання вже закрите");
    }

    @Override
    public void send(TCPConnection connection, String data)
    {
        System.out.println("Помилка: не можна відправляти дані, з'єднання закрите");
    }

    @Override
    public void receive(TCPConnection connection)
    {
        System.out.println("Помилка: не можна отримувати дані, з'єднання закрите");
    }
}

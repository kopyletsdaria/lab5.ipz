package task2;
/**
 * Context
 */

public class TCPConnection
{
    private ConnectionState currentState;
    public TCPConnection()
    {
        this.currentState = new ListeningState();
    }

    public void setState(ConnectionState newState)
    {
        this.currentState = newState;
        System.out.println("Стан змінено на: " + newState.getClass().getSimpleName() + "...");
    }

    public void open()
    {
        currentState.open(this);
    }

    public void close()
    {
        currentState.close(this);
    }

    public void send(String data)
    {
        currentState.send(this, data);
    }

    public void receive()
    {
        currentState.receive(this);
    }
}
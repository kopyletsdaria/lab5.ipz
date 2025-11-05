package task2;
/**
 * Інтерфейс
 */

public interface ConnectionState
{
    //Передаємо сам об'єкт TCPConnection у методи
    void open(TCPConnection connection);
    void close(TCPConnection connection);
    void send(TCPConnection connection, String data);
    void receive(TCPConnection connection);
}
package task2;
/**
 * Демонстрація
 */

public class Main
{
    public static void main(String[] args)
    {
        TCPConnection connection = new TCPConnection();
        System.out.println("\nСпроба у стані Listening...");
        connection.send("Hello"); //Має видати помилку
        connection.receive();

        System.out.println("\nВідкриваємо з'єднання...");
        connection.open(); //Має перейти в EstablishedState

        System.out.println("\nСпроба у стані Established...");
        connection.open(); //Має видати помилку
        connection.send("My data packet"); //Має спрацювати
        connection.receive();

        System.out.println("\nЗакриваємо з'єднання...");
        connection.close(); //Має перейти в ClosedState

        System.out.println("\nСпроба у стані Closed...");
        connection.send("Data after close"); //Має видати помилку
        connection.close(); //Має видати помилку

        System.out.println("\nПовторне відкриття...");
        connection.open(); //Має перейти в ListeningState
        connection.receive();
    }
}

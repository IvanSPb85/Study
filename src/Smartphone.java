// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {
    String appName = "Telega";
    String email = "Email";
    String text = "Message";

    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

    @Override
    public void makeCall(String targetNumber) {
        super.makeCall(targetNumber);
        makeCall(targetNumber, appName);
        sendEmail(email, text);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
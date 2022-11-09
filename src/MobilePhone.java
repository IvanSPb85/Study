public class MobilePhone extends Phone {
    String messageText = "messageText";

    public MobilePhone(String number) {
        super(number);
    }

    @Override
    public void makeCall(String targetNumber) {
        super.makeCall(targetNumber);
        sendSms(targetNumber, messageText);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
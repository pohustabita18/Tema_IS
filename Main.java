import notifications.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select notification type (email / sms / push): ");
        String type = scanner.nextLine();

        NotificationFactory factory;

        switch (type.toLowerCase()) {
            case "email":
                factory = new EmailNotificationFactory();
                break;
            case "sms":
                factory = new SMSNotificationFactory();
                break;
            case "push":
                factory = new PushNotificationFactory();
                break;
            default:
                System.out.println("Unknown type.");
                return;
        }

        factory.sendNotification();
    }
}

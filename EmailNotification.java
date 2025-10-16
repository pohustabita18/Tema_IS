package notifications;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an EMAIL notification...");
    }
}

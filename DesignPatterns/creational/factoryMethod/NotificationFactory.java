package factoryMethod;

public abstract class NotificationFactory {

	public void sendNotification() {
		// some logic
		Notification n = createNotification();
		n.send();
	}

	public abstract Notification createNotification();
}

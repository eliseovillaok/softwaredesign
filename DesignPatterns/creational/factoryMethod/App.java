/**
 * 
 */
package factoryMethod;

/**
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NotificationFactory emailNotification = new EmailFactory("example@example.com", "Example",
				"This is a example notification email");
		NotificationFactory smsNotification = new SMSFactory(112233421, "Hello! i'm a notification sms");
		NotificationFactory pushNotification = new PushFactory("foo1234foo1234foo1234", "HELLONOTIFICATION",
				"I'm a push notification");

		emailNotification.sendNotification();
		smsNotification.sendNotification();
		pushNotification.sendNotification();

	}

}

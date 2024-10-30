package factoryMethod;

public class SMSNotification implements Notification {
	private int number;
	private String message;

	public SMSNotification(int number, String message) {
		this.message = message;
		this.number = number;
	}

	@Override
	public void send() {
		System.out.println("// SMS Notification // \n Message sent to " + number + ": '" + message + "'");
	}

}

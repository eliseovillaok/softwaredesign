package example1;

public class SMSFactory extends NotificationFactory {
	private int number;
	private String message;
	
	
	public SMSFactory(int number, String message) {
		super();
		this.number = number;
		this.message = message;
	}


	@Override
	public Notification createNotification() {
		return new SMSNotification(number, message);
	}

}

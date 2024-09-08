package example1;

public class PushFactory extends NotificationFactory {
	private String token;
	private String title;
	private String message;
	
	
	public PushFactory(String token, String title, String message) {
		super();
		this.token = token;
		this.title = title;
		this.message = message;
	}


	@Override
	public Notification createNotification() {
		return new PushNotification(token, title, message);
	}

}

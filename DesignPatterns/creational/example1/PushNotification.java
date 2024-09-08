package example1;

public class PushNotification implements Notification {
	private String token;
	private String title;
	private String message;
	
	public PushNotification(String token, String title, String message) {
		super();
		this.token = token;
		this.title = title;
		this.message = message;
	}

	@Override
	public void send() {
		System.out.println("// Push notification // \n Title '"+title+"'; Message '"+message+ "' to Token: "+token);
	}

}

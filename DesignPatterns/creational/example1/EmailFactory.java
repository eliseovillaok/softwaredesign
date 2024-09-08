package example1;

public class EmailFactory extends NotificationFactory {
	private String recipient;
	private String subject;
	private String body;
	
	
	public EmailFactory(String recipient, String subject, String body) {
		super();
		this.recipient = recipient;
		this.subject = subject;
		this.body = body;
	}


	@Override
	public Notification createNotification() {
		return new EmailNotification(recipient,subject,body);
	}

}

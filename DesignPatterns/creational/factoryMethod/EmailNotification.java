package factoryMethod;

public class EmailNotification implements Notification {
	private String recipient;
	private String subject;
	private String body;

	public EmailNotification(String recipient, String subject, String body) {
		super();
		this.recipient = recipient;
		this.subject = subject;
		this.body = body;
	}

	@Override
	public void send() {
		System.out.println(
				"// Email notification // \n Recipient: " + recipient + "; Subject: " + subject + "; Body: " + body);

	}

}

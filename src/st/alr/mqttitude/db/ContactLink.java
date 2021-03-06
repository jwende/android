package st.alr.mqttitude.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CONTACT_LINK.
 */
public class ContactLink {

	/** Not-null value. */
	private String topic;
	private long contactId;

	public ContactLink() {
	}

	public ContactLink(String topic) {
		this.topic = topic;
	}

	public ContactLink(String topic, long contactId) {
		this.topic = topic;
		this.contactId = contactId;
	}

	/** Not-null value. */
	public String getTopic() {
		return this.topic;
	}

	/**
	 * Not-null value; ensure this value is available before it is saved to the
	 * database.
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public long getContactId() {
		return this.contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

}

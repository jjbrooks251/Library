package Classes;

public class Thesis extends Documents {

	private String topic;

	public Thesis(String location, int itemId, String publisher, double id, int stock, String writer, String topic) {
		super(location, itemId, publisher, id, stock, writer);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return getLocation() + ", " + getItemId() + ", " + getPublisher() + ", " + getId() + ", " + getStock() + ", "
				+ getWriter() + ", " + topic;
	}

}

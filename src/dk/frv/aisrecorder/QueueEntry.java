package dk.frv.aisrecorder;

import java.util.Date;

import dk.frv.ais.message.AisMessage;

public class QueueEntry {

	private AisMessage aisMessage;
	private Date received;

	public QueueEntry(AisMessage aisMessage, Date received) {
		this.aisMessage = aisMessage;
		this.received = received;
	}

	public AisMessage getAisMessage() {
		return aisMessage;
	}

	public void setAisMessage(AisMessage aisMessage) {
		this.aisMessage = aisMessage;
	}

	public Date getReceived() {
		return received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}
	
}

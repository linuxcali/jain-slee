package org.mobicents.slee.resources.smpp.pdu;

import net.java.slee.resources.smpp.pdu.Address;
import net.java.slee.resources.smpp.pdu.ReplaceSM;
import net.java.slee.resources.smpp.pdu.SmppResponse;
import net.java.slee.resources.smpp.pdu.Tag;
import net.java.slee.resources.smpp.util.SMPPDate;

import org.mobicents.protocols.smpp.message.SMPPPacket;
import org.mobicents.slee.resources.smpp.ExtSmppRequest;
import org.mobicents.slee.resources.smpp.util.SMPPDateImpl;

/**
 * 
 * @author amit bhayani
 * 
 */
public class ReplaceSMImpl extends PDUImpl implements ReplaceSM, ExtSmppRequest {

	public ReplaceSMImpl(org.mobicents.protocols.smpp.message.ReplaceSM replaceSM) {
		this.smppPacket = replaceSM;
	}

	public ReplaceSMImpl(long sequenceNumber) {
		super();
		this.smppPacket = new org.mobicents.protocols.smpp.message.ReplaceSM();
		this.smppPacket.setSequenceNum(sequenceNumber);
	}

	public byte[] getMessage() {
		return ((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getMessage();
	}

	public String getMessageID() {
		return ((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getMessageId();
	}

	public int getRegisteredDelivery() {
		return ((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getRegistered();
	}

	public SMPPDate getScheduleDeliveryTime() {
		return this.convertProtoDate(((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket)
				.getDeliveryTime());
	}

	public int getSmDefaultMsgID() {
		return ((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getDefaultMsg();
	}

	public Address getSourceAddress() {
		return this.convertProtoAddress(((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getSource());
	}

	public SMPPDate getValidityPeriod() {
		return this
				.convertProtoDate(((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).getExpiryTime());
	}

	public void setMessage(byte[] message) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setMessage(message);
	}

	public void setMessageID(String messageID) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setMessageId(messageID);
	}

	public void setRegisteredDelivery(int registeredDelivery) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setRegistered(registeredDelivery);
	}

	public void setScheduleDeliveryTime(SMPPDate time) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setDeliveryTime(((SMPPDateImpl) time)
				.getSMPPDate());
	}

	public void setSmDefaultMsgID(int smDefaultMsgID) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setDefaultMsg(smDefaultMsgID);
	}

	public void setSourceAddress(Address address) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setSource(((AddressImpl) address)
				.getProtoAddress());
	}

	public void setValidityPeriod(SMPPDate period) {
		((org.mobicents.protocols.smpp.message.ReplaceSM) this.smppPacket).setExpiryTime(((SMPPDateImpl) period)
				.getSMPPDate());
	}

	public SmppResponse createSmppResponseEvent(int status) {
		ReplaceSMRespImpl replaceSMRespImpl = new ReplaceSMRespImpl(status);
		replaceSMRespImpl.setSequenceNum(this.getSequenceNum());
		return replaceSMRespImpl;
	}

	public boolean isTLVPermitted(Tag tag) {
		return (tag.equals(Tag.MESSAGE_PAYLOAD));
	}

	public SMPPPacket getSMPPPacket() {
		return this.smppPacket;
	}

}
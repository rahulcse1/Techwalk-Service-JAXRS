package com.techwalk.rs.Techwalk_Service_JAXRS.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techwalk.rs.Techwalk_Service_JAXRS.model.Author;
import com.techwalk.rs.Techwalk_Service_JAXRS.model.Message;

/**
 * 
 * @author techwalk
 *
 */
public class MessageService {

	List<Message> messages = new ArrayList<Message>();
	Map<Long, Message> messagesMap = new HashMap<Long, Message>();

	public List<Message> getAllMessages() {
		Author a1 = new Author("Amarjeet", "Chauhan");
		Author a2 = new Author("Techwalk", "Organization");
		Message m1 = new Message(1l, "This is Message one", a1);
		messagesMap.put(1l, m1);
		Message m2 = new Message(2l, "This is Message two", a1);
		messagesMap.put(2l, m2);
		Message m3 = new Message(3l, "This is Message three", a2);
		messagesMap.put(3l, m3);
		Message m4 = new Message(4l, "This is Message four", a1);
		messagesMap.put(4l, m4);
		Message m5 = new Message(5l, "This is Message five", a2);
		messagesMap.put(5l, m5);

		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		messages.add(m5);

		return messages;
	}

	public Message getMessage(Long id) {
		getAllMessages();
		return messagesMap.get(id);
	}

	public Message addMessage(Message message) {
		Message msg = new Message(6l, message.getMessage(), message.getAuthor());
		messages.add(msg);
		messagesMap.put(6l, msg);
		return msg;
	}

	public Message updateMessage(Message message) {
		Message oldMsg = messagesMap.get(message.getId());
		oldMsg.setMessage(message.getMessage());
		return oldMsg;
	}

	public Message deleteMessage(Long id) {
		return messagesMap.remove(id);
	}
}

/**
 * 
 */
package com.designpatterns.factory;

/**
 * @author divye
 */

interface Notification {
	void send();
}

class EmailNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Notify by Email");
	}
	
}

class MessageNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Notify by SMS");
	}
	
}


class NotificationFactory {
	
	public static Notification createNotification(String type) {
		if(type.equals("email")) {
			return new EmailNotification();
		}
		if(type.equals("sms")) {
			return new MessageNotification();
		}
		return null;
	}
	
}


public class FactoryDemo1 {

	
	public static void main(String[] args) {
		Notification smsNotification = NotificationFactory.createNotification("sms");
		smsNotification.send();
		
		Notification emailNotification = NotificationFactory.createNotification("email");
		emailNotification.send();
	}
	
}

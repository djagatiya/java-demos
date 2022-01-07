package com.designpatterns.strategy;

interface Payment {
	void pay(int amount);
}

class UpiPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("[" + amount + "] paid via UPI.");
	}
	
}

class NetBankingPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("[" + amount + "] paid via NetBanking.");
	}
	
}

class PaypalPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("[" + amount + "] paid via PayPal.");
	}
}


class PaymentContext {
	
	private Payment payment;
	
	public PaymentContext(Payment payment) {
		this.setContext(payment);
	}
	
	public void setContext(Payment payment) {
		this.payment = payment;
	}
	
	public void makePayment(int amount) {
		payment.pay(amount);
	}
	
}



public class StrategyDemo1 {
	public static void main(String[] args) {
		
		Payment upiPayment = new UpiPayment();
		Payment netBankingPayment = new NetBankingPayment();
		Payment paypalPayment = new PaypalPayment();
		
		
		PaymentContext context = new PaymentContext(upiPayment);
		context.makePayment(10);
		
		context.setContext(netBankingPayment);
		context.makePayment(20);
		
		context.setContext(paypalPayment);
		context.makePayment(50);
		
	}
}

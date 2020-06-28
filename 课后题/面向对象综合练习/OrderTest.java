package object;

public class OrderTest{
	public static void main(String[] args) {
		Order order1 = new Order(1001, "AA");
		Order order2 = new Order(1001, "AA");
		
		System.out.println(order1.equals(order2));
	}
}

class Order {
	private int orderId;
	private String orderName;
	
	public Order() {
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} 
		if (obj instanceof Order) {
			Order order = (Order)obj;
			return this.orderId == order.orderId && 
					this.orderName.equals(order.orderName);
		}
		return false;
	}
	
}

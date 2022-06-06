package FinalReview;

public abstract class Item {
	protected  String name;
	protected double price;
	protected double amount;
	protected ItemType iType;
	
	static double TotalAmount;
	
	
	public abstract void Discount();
	
	
	public static String Do() {
		return "";
	}

	
	public Item() {
		name ="";
		price=0;
		amount=0;
	}
	
	public Item(String name, double price, double amount) {
		setName(name);
		setPrice(price);
		try {
			setAmount(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return name + "\t"+ price + "\t" + amount;
	}

	public String toString(int size) {
		return (name + "................................................").substring(0,25) + (price+"..................................").substring(0,25) + "\t" + (amount+".....................................................").substring(0,25);
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) throws Exception {
		
		if (amount<0) {
			Exception ex = new Exception("Amount must be positive number");
			throw ex;
		}
		
		TotalAmount = TotalAmount + amount- this.amount;
		this.amount = amount;
	}

	
}

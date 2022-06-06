package FinalReview;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodItem extends Item implements DomesticType {
	public int usageLife=100;
	public Date productDate;
	public String orginPlace;
	
	public FoodItem() {
		super("",0,0);
		orginPlace="";
	}
	
	
	public String toString() {
		return name + "\t"+ price + "\t" + amount +" (remainDay:" +remainDay() + ")";
	}
	
	
	public long remainDay() {
		Date today;
		today = new Date( );
		long diff = today.getTime() - productDate.getTime();
		return usageLife-TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public boolean isExpire() {
		
		Date today;
		today = new Date( );
		long diff = today.getTime() - productDate.getTime();
		if (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)>=usageLife) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public void Discount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDomestic() {
		// TODO Auto-generated method stub
		if (orginPlace.toLowerCase().equals("adana")) {
			return true;
		} else {
			return false;
		}
		
	}
	
}

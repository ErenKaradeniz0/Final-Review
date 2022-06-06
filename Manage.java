package FinalReview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Manage {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022,1-1,10);
		Date d= cal.getTime();
		
		FoodItem fi = new FoodItem();
		
		fi.productDate = cal.getTime();
		
		
		ArrayList<Item> list= new  ArrayList<Item>();
		FillArrayList(list);
		
	
		toPrintDomestic(list);
	
	}
	
	public static void toPrintDomestic(ArrayList<Item> list)  {
		for(Item item : list) {
			if (item instanceof DomesticType) {
				if (((DomesticType)item).isDomestic()) {
					System.out.println(item.toString()+ " is domestic");
				}
			}
			System.out.println(item.toString());
		}
		 
	}
	
	
	public static void toString(ArrayList<Item> list)  {
		for(Item item : list) {
			System.out.println(item.toString());
		}
		 
	}
	
	public static void FillArrayList(ArrayList<Item> list)  {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2022,1-1,10);
		int rn = 10+ ((int)(Math.random() * 20));
		
		for(int i=0;i<rn;i++) {
			Item item = null;
			
			if (Math.random() <0.5) {
				item = new FoodItem();
				((FoodItem)item).usageLife = (int)Math.random() * 100;
				((FoodItem)item).productDate = cal.getTime();
				if (Math.random() <0.5) {
					((FoodItem)item).orginPlace="Adana";
				}
			} else {
				item = new EItem();
				((EItem)item).IME ="SSSS";
			}

			item.iType = ItemType.FRESHMAN;
			
			item.setPrice(Math.random() * 100);
			try {
				item.setAmount(Math.random() * 100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.add(item);
		}
	}
}

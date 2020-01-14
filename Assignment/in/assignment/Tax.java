package in.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Tax extends SaleTax
{
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		boolean valid;
		double amount;
		String more = "yes";
		while (more.equals("yes")) {
			System.out.println("Do you want to enter details of any  item yes/no");
			more = sc.nextLine();

			if (more.equals("yes")) {
				String item = sc.nextLine();
				
				ValidItem items = new ValidItem();
				valid = items.validity(item);
				if (!valid) {
					System.out.println("Your data is not valid. Please try again");
					continue;
				} else {
					amount = items.getTax();
					// System.out.println(name);
					String record = "name:" + items.itemName + " price: "
							+ items.itemPrice + " Tax:  " + (items.result)
							/ items.itemQuantity + " amount: " + (items.itemQuantity)
							* (items.result)*items.itemPrice ;
					list.add(record);

				}
			}

		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

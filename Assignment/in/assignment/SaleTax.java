package in.assignment;

public class SaleTax 
{
	public String itemName;
	public double itemPrice;
	public int itemQuantity;
	public String itemType;
	public double result;

	
	
		double getTax() 
		{
			

			if (itemType.equals("raw")) 
			{
				result = (0.125 * itemPrice * itemQuantity);
				
			} 
			else if (itemType.equals("manufactured"))
			{
				result = 0.125 * itemPrice * itemQuantity + 0.02
						* (itemPrice * itemQuantity + 0.125 * itemPrice);

			} 
			else if (itemType.equals("imported")) 
			{
				result = 0.1 * itemPrice * itemQuantity;
				if (itemPrice * itemQuantity+ result < 100) 
				{
					result += 5;
				} 
				else if (itemPrice* itemQuantity + result > 100 && itemPrice * itemQuantity + result < 200) 
				{
					result += 10;
				} 
				else 
				{
					result += 0.05 * (result + itemPrice * itemQuantity);
				}
			}


		

		return (result);

	}

}

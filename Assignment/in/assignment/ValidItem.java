package in.assignment;

public class ValidItem extends SaleTax 
{
	String[] words;
	String[] token;
	boolean ans=true;
	
	boolean validity(String item) 
	{
		
		words = item.split("-");
		if(!item.startsWith("-name"))
		{
		    System.out.print("Start with ItemName. ");
			ans=false;
		}
		if(words.length>5)
		{
			System.out.print("Enter positive values. ");
			ans=false;
			
		}
		for (int j = 0; j < words.length; j++) 
		{
			token=words[j].split(" ");
			
			if(token[0].equals("name"))
			{
					itemName= token[1];
			}
			 if(token[0].equals("price"))
			{
				 try
				 {
					 itemPrice= Double.parseDouble(token[1]);
					 
				 }
				 catch(NumberFormatException e)
				 {
						System.out.println("Price should be in integer/double. ");
						ans=false;
				 }
				 catch(ArrayIndexOutOfBoundsException e)
				 {
					 System.out.print("Please Enter Value of price. ");
					 ans=false;
				 }
				 if(itemPrice==0)
				 {
					 System.out.print("Please Enter Valid Value of price. ");
					 ans=false;
				 }
				
			}
			else if(token[0].equals("quantity"))
			{
				validateQuantity();
				
			}
			else if(token[0].equals("type"))
			{
				try
				{
					itemType= token[1];
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					 System.out.print("Please Enter Value of type. ");
					 ans=false;
				}
			}
			
		}
		
		  return(ans);    
		
	}

	private void validateQuantity() {
		try
		{
			itemQuantity= Integer.parseInt(token[1]);
		}
		catch(NumberFormatException e)
		{
			System.out.print("Quantity should be in integer. ");
			ans=false;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.print("Please Enter Value of quantity. ");
			 ans=false;
		}
	}

}

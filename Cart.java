import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
 *Cart class is for storing information of cart
 *products in cart and their quantity and total bill
 */

class Cart {
	Map<Integer,Integer> map= new HashMap();

	Item pencil,pen;
	/**
	 * this is function to add item to cart
	 * @param id
	 */
	void addItem(int id)
	{
		if(!map.containsKey(id))
		{
			map.put(id,1);

			System.out.println("inserted sucessfully\n\n");
		}
		else
		{	
			System.out.println("item already exists\n\n");
		}
	}
	
	/**
	 * this function removes item from cart
	 * @param id
	 */

	void removeItem(int id)
	{
		if(map.containsKey(id))
		{
			map.remove(id);
			System.out.println("removed sucessfully\n\n");
		}
		else
		{
			System.out.println("item not exists\n\n");
		}

	}

	/**
	 *this functionn increase existining item
	 * @param id
	 */
	void increaseItem(int id)
	{
		if(map.containsKey(id))
		{
			map.put(id,map.get(id)+1);
			System.out.println("updated sucessfully\n\n");
		}
		else
		{
			System.out.println("please add a item first\n\n");
		}
	}

	/**
	 * this function display the items in cart
	 * @param allItems
	 */
	void displayCart(ArrayList<Item> allItems)
	{	
		System.out.println("Your cart contain");
		System.out.println("Item\t name\tQuantity\n");
		for(Map.Entry m:map.entrySet())
		{  
			System.out.println(m.getKey()+" \t "+allItems.get((int)m.getKey()-1).getName()+"\t"+m.getValue()+"\n\n"); 

		}  
		System.out.println("-------------------------------------------------------------------------------------------------------");

	}
	/**
	 * this function decreases item from cart if it exists and if its quantity reaches 0, it removes item from the cart
	 * @param id
	 */

	void decreaseItem(int id)
	{	
		if(map.containsKey(id)&&map.get(id)-1!=0)
		{
			map.put(id,map.get(id)-1);
			System.out.println("updated sucessfully");
		}
		else if(map.get(id)-1==0)
		{
			map.remove(id);
		}

		else
		{
			System.out.println("please add a item first");
		}
	}

	double generateBill(ArrayList<Item> allItems)
	{
		double totalBill=0;
		for(Map.Entry m:map.entrySet())
		{  
			totalBill+= (int)m.getValue() * allItems.get((int)m.getKey()-1).getPrice();  
		}  

		return totalBill;
	}

}


/**
 * class is used to store information about product
 * date 10/01/20
 * @author Ayush pandey get-2020
 *
 */
class Item
{	static int init=0;
private String nameOfItem;
private double price;
int id;
/**
 * 
 * @param name
 * @param amount
 * @param id
 */
Item(String name, double amount)
{
	nameOfItem=name;
	price=amount;
	init++;
	id+=init;
}


/**
 * 
 * @return name of item
 */
String getName()
{
	return nameOfItem;

}


/**
 * 
 * @return price of item
 */
double getPrice()
{
	return price;

}
/**
 * 
 * @return information about product
 */

public String toString()
{
	return id+ "\t"+nameOfItem+"\t"+price;
}

}



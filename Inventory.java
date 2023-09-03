package app;
import java.util.ArrayList;


public class Inventory {
private ArrayList<Product> inventoryList;
public Inventory() {
	inventoryList = new ArrayList<Product>();
	// following items are for testing purposes
    Product itemSword = new Weapon("Sword", "A dull sword", 12, 0, 1.5, 5);
	addItem(itemSword);
	Product itemBow = new Weapon("Bow", "A simple wooden short bow", 15, 0, 2.7, 6);
	addItem(itemBow); 
	Product itemShield = new Armor("Shield", "A wooden shield", 3, 0, 3.1, 5);
	addItem(itemShield);
	Product itemHelmet = new Armor("Helmet", "Protects your head", 4, 0, 5.7, 4);
	addItem(itemHelmet);
	Product itemPotion = new Health("Potion", "Restores 5 hp", 10, 0, 5.1, 5);
	addItem(itemPotion);

}
public void addItem(Product item) {
	inventoryList.add(item);
}
public void removeItem(Product item) {
	inventoryList.remove(item);
}
public void changeQuantity(Product item, int change) { // decreases quantity by one
	int newQuantity = item.getQuantity() + change;
	item.setQuantity(newQuantity);
}
public void addCart(Product item) {
	changeQuantity(item, -1);
}
public void removeCart(Product item) {
	changeQuantity(item, 1);
}

public void displayInventory() {
	for (Product item: inventoryList) {
		item.displayProduct();
	}
}

public Product getItem(int i) {
	return inventoryList.get(i);
}
public void getItem(Product item) {
	//System.out.println(item.getName());
	if (item != null) {
	System.out.println(item.toString()); }
}
public Product matchItem(String name) {
	for (Product item: inventoryList) {
		int m = item.compareTo(name);
		if (m == 0) {
			//getItem(item);
			return item;
		}
	}
	System.out.println("Please select an item in stock");
	return null;

}
}
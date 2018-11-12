package zooted.zooted_coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;


@Component
public class ZootedMenu {

	
	protected List <MenuItem> list = new ArrayList<>();
	
	public ZootedMenu () {
		list.add(new MenuItem("Blueberry & Strawberry shake", "Drink","Morning shake with a kick of ginger to keep you zooted.", 6.78 ));
		list.add(new MenuItem("Hot Chocolate with Esspresso", "Drink","Stay zooted all day with this choco coffee mix.", 4.25 ));
		list.add(new MenuItem("Zooted Signature Coffee", "Drink", "Totally not basic, or maybe- just has zooted in the name", 5.48));
		list.add(new MenuItem("Zooted mug", "Merchandise", "A necessary accessory to advertise our brand", 8.99));
		list.add(new MenuItem("Bag ol' beans","Merchandise", "Don't want us to make your coffee? Make it yourself then.", 9.99 ));
		list.add(new MenuItem("Zooted Coffee Scrub", "Merchandise", "So you can bathe in the blood of your coffee.", 12.98));
		list.add(new MenuItem("Light Roast", "Drink", "The only normal coffee we have, for the regular humans.", 3.99));
		list.add(new MenuItem("Chai Latte", "Drink", "Has all the yummy spices that you need-like tea but better.", 3.55));
	}
	
	/**
	 * Get list of all foods.
	 */
	public List<MenuItem> getMenuItems() {
		return list;
		//with spring componets no statics
	}
	
	/**
	 * Get list of foods in a given category.
	 */
	public List<MenuItem> getFoodsInCategory(String category) {
		List<MenuItem> matches = new ArrayList<>();
		for(MenuItem food : list) {
			if (food.getCategory().equalsIgnoreCase(category)) {
				matches.add(food);
			}
		}
		return matches;
	}
	
	/**
	 * Get list of food with name matching a keyword.
	 */
	public List<MenuItem> getFoodsByKeyword(String keyword) {
		keyword = keyword.toLowerCase();
		List<MenuItem> matches = new ArrayList<>();
		for(MenuItem food : list) {
			if (food.getName().toLowerCase().contains(keyword)) {
				matches.add(food);
			}
		}
		return matches;
	}
	
	/**
	 * Get set of food categories.
	 */
	public Set<String> getCategories() {
		Set<String> categories = new TreeSet<>();
		for(MenuItem food : list) {
			categories.add(food.getCategory());
		}
		return categories;
	}

	/**
	 * Add a food to the list
	 */
	public void addFood(MenuItem food) {
		list.add(food);
	}

}

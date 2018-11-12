package zooted.zooted_coffee;

public class MenuItem {
	
	protected String name;
	protected String category;
	protected String description;
	protected double price;
	
	MenuItem(){}

	public MenuItem(String name, String category, String description, double price) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", category=" + category + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
	

}

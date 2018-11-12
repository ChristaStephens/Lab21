package zooted.zooted_coffee;

public class MenuItem {
	
	protected Long id;
	protected String name;
	protected String category;
	protected String description;
	protected Double price;
	
	public MenuItem() {}
	
	
	public MenuItem(Long id, String name, String category, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
	
	
}

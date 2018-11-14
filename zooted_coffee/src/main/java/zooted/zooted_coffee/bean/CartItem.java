package zooted.zooted_coffee.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	protected Long id;
	protected Integer quantity;
	

	@ManyToOne
	//there's many items on the menu and only one cart
	protected MenuItem menuItem;

	public CartItem() {}

	public CartItem(Long id, Integer quantity, MenuItem menuItem) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.menuItem = menuItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", quantity=" + quantity + ", menuItem=" + menuItem + "]";
	}

	
	
	}

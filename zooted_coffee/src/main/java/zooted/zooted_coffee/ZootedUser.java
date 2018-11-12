package zooted.zooted_coffee;

public class ZootedUser {
	
	protected String name;
	protected String last;
	protected String bday;
	protected String coffee;
	protected String email;
	protected String updates;
	protected String sal;
	
	public ZootedUser () {}
	
	
	public ZootedUser(String name, String last, String bday, String coffee, String email, String updates, String sal) {
		super();
		this.name = name;
		this.last = last;
		this.bday = bday;
		this.coffee = coffee;
		this.email = email;
		this.updates = updates;
		this.sal = sal;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getCoffee() {
		return coffee;
	}

	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpdates() {
		return updates;
	}

	public void setUpdates(String updates) {
		this.updates = updates;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "ZootedUser [name=" + name + ", last=" + last + ", bday=" + bday + ", coffee=" + coffee + ", email="
				+ email + ", updates=" + updates + ", sal=" + sal + "]";
	}
	
	

}

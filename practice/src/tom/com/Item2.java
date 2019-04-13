package tom.com;

public class Item2 {
	String name;
	int number;
	public Item2(String name,int number) {
		setNumber(number);
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
}

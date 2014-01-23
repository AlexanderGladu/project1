package csci2020u.info;

public class Person {
	String name;
	int age;
	public String myHomepage;
	protected String homeAddress;
	private String personalEmailPassword;
	private String workEmailPassword;

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getName());
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
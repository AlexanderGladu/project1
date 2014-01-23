package csci2020u.exec;
import csci2020u.info.Person;

class Run {
	public static void main(String[] args) {
		Person f = new Person();
		f.setName("Steve");

		System.out.println(f.getName());
	}
}
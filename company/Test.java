package company;

public class Test {
	public static void main(String[] args) {
		Manager ma = new Manager("Andy");
		ma.print();
		Salesman sa = new Salesman("Ferdinand"); 
		sa.print();
		Staff st = new Staff("joye");
		st.print();
	}
}

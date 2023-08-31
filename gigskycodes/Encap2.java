package gigskycodes;

public class Encap2 {
	public static void main(String[] args) {
		Encapsulation pay = new Encapsulation();
		System.out.println(pay.getCreditCardNumber());

		pay.setCreditCardNumber("1111 1111 1111 1111");
		System.out.println(pay.getCreditCardNumber());
	}
}

package calistir;

import beans.B;
import beans.E;
import beans.F;
import beans.G;
import beans.Ortak;

public class Calistir {
	public static void main(String[] args) {
		G g = new G();
		test(g);

		E e = new E();
		test(e);

		B b = new B();
		test(b);

		F f = new F();
		test(f);
	}

	public static void test(Ortak i) {
		i.c();
	}
}

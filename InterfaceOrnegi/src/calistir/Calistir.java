package calistir;

import beans.B;
import beans.F;
import beans.G;

public class Calistir {
	public static void main(String[] args) {
		B b = new B();
		test(b);

		F f = new F();
		test(f);

		G g = new G();
		test(g);

		// D d = new D();
		// test(d); // bu satır açıldığında hata veriyor çünkü D sınıfı B
		// sınıfı tipindeki değişkene atanamıyor. Aralarında sınıf hiyerarşisi
		// bulunmuyor.

	}

	public static void test(B i) {
		i.a();
	}
}

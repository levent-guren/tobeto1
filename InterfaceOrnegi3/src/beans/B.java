package beans;

public class B extends A implements Ortak, IkinciInterface {
	public void a() {
		System.out.println("B.a()");
	}

	public void c() {
		System.out.println("B.c()");
	}
}

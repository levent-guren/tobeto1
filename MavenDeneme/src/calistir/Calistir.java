package calistir;

import beans.Bilgisayar;

public class Calistir {
	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();
		bilgisayar.setMarka("Monster");
		bilgisayar.setModel("A17");
		bilgisayar.setHdd(1000);
		bilgisayar.setRam(32);
		System.out.println(bilgisayar);
	}
}

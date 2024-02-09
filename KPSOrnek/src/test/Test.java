package test;

import kps.webservice.KPSPublic;

public class Test {
	public static void main(String[] args) {
		System.out.println(
				new KPSPublic().getKPSPublicSoap().tcKimlikNoDogrula(30850860202L, "Ömer", "Özgür", 1998));
	}
}

package calisma;

public class UcUsleriniKontrol {
	public static void main(String[] args) {
		int sayi = 27;
		if (ucunUssuMu(sayi)) {
			System.out.println(sayi + " sayısı 3'ün üslerinden biridir.");
		} else {
			System.out.println(sayi + " sayısı 3'ün üslerinden biri değildir.");
		}
	}

	private static boolean ucunUssuMu(int sayi) {
		long kontrol = 1;
		while (kontrol <= sayi) {
			if (sayi == kontrol) {
				return true;
			}
			kontrol *= 3;
		}
		return false;
	}
}

package beans2;

public class Cocuk2 implements ICocuk {
	private int yas;
	
	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas*2;
	}

	@Override
	public String toString() {
		return "Cocuk (yas:"+yas+")";
	}
	
}

package beans2;

public class Cocuk implements ICocuk {
	private int yas;
	
	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Cocuk (yas:"+yas+")";
	}
	
}

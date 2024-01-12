package beans;

public class Kitap {
	private String isbn;
	private String adi;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Kitap [isbn=" + isbn + ", adi=" + adi + "]";
	}

}

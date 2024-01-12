package beans;

public class Garaj {
	private int m2;
	private Motosiklet motosiklet1;
	private Motosiklet motosiklet2;

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public Motosiklet getMotosiklet1() {
		return motosiklet1;
	}

	public void setMotosiklet1(Motosiklet motosiklet1) {
		this.motosiklet1 = motosiklet1;
	}

	public Motosiklet getMotosiklet2() {
		return motosiklet2;
	}

	public void setMotosiklet2(Motosiklet motosiklet2) {
		this.motosiklet2 = motosiklet2;
	}

	@Override
	public String toString() {
		return "Garaj [m2=" + m2 + ", motosiklet1=" + motosiklet1 + ", motosiklet2=" + motosiklet2
				+ "]";
	}

}

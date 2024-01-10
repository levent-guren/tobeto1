package beans;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "model")
public class Bilgisayar {
	private String marka;
	private String model;
	private int ram;
	private int hdd;
}

package calistir2;

import java.util.function.Consumer;

public class Yaz implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

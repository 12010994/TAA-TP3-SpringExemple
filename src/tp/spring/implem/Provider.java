package tp.spring.implem;

import tp.spring.intet.IProvider;

public class Provider implements IProvider {

	@Override
	public void send(String string, String string2) {
		System.err.println(string + " " + string2);
		
	}

}

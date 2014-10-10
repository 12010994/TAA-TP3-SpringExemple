package tp.spring.implem;

import tp.spring.intet.IBank;
import tp.spring.intet.IFastLane;
import tp.spring.intet.IJustHaveALook;
import tp.spring.intet.ILane;
import tp.spring.intet.IProvider;
import tp.spring.intet.IStore;

public class Store implements IFastLane, IJustHaveALook, ILane, IStore {

	IProvider provider;
	IBank bank;
	public IProvider getProvider() {
		return provider;
	}
	public void setProvider(IProvider provider) {
		this.provider = provider;
	}
	public IBank getBank() {
		return bank;
	}
	public void setBank(IBank bank) {
		this.bank = bank;
	}
	public boolean hasProduct(String string) {

			return true;
	}
	@Override
	public void buy(String string) {
		bank.createTransaction(25, "c1","c2");
		provider.send(string, "adresse");
	}
}

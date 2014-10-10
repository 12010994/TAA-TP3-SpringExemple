package tp.spring.implem;

import tp.spring.intet.IClient;
import tp.spring.intet.IFastLane;
import tp.spring.intet.IJustHaveALook;
import tp.spring.intet.ILane;
import tp.spring.intet.IRun;

public class Client implements IClient, IRun {

	
	IFastLane lane;
	IJustHaveALook have;
	ILane ilane;
	public IFastLane getLane() {
		return lane;
	}
	public void setLane(IFastLane lane) {
		this.lane = lane;
	}
	public IJustHaveALook getHave() {
		return have;
	}
	public void setHave(IJustHaveALook have) {
		this.have = have;
	}
	public ILane getIlane() {
		return ilane;
	}
	public void setIlane(ILane ilane) {
		this.ilane = ilane;
	}
	@Override
	public void startBuy() {
		if (have.hasProduct("toto"))
			ilane.buy("toto");
		
		
	}
}

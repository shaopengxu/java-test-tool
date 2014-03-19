package aboutSerializable;

import java.io.Serializable;

public class AllyMember implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2825583327519272258L;
	private Ally ally;

	private int id;

	public Ally getAlly() {
		return ally;
	}

	public void setAlly(Ally ally) {
		this.ally = ally;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

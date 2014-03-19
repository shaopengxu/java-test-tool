package aboutSerializable;

import java.io.Serializable;
import java.util.List;

public class Ally implements Serializable {

	/**
	 * 
	 */
	private String name;
	private static final long serialVersionUID = -8789289198861391251L;
	private List<AllyMember> allyMember;

	public List<AllyMember> getAllyMember() {
		return allyMember;
	}

	public void setAllyMember(List<AllyMember> allyMember) {
		this.allyMember = allyMember;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

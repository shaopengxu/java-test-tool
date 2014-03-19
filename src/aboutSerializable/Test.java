package aboutSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws FileNotFoundException,
			ClassNotFoundException, IOException {
		readAndUpdateAllyAndMember();
	}

	public static void readAlly() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		Ally ally = new Ally();
		ally.setName("abc");
		AllyMember allyMemberA = new AllyMember();
		allyMemberA.setId(1);
		allyMemberA.setAlly(ally);
		AllyMember allyMemberB = new AllyMember();
		allyMemberB.setId(2);
		allyMemberB.setAlly(ally);
		ally.setAllyMember(new ArrayList<AllyMember>());
		ally.getAllyMember().add(allyMemberA);
		ally.getAllyMember().add(allyMemberB);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"objectFile1.obj"));
		out.writeObject(ally);
		out.flush();
		out.close();
		ObjectInputStream in = new ObjectInputStream

		(new FileInputStream("objectFile1.obj"));
		Ally ally2 = (Ally) in.readObject();
		System.out.println(ally2 == ally);
		System.out.println(ally2.getName());
		System.out.println(ally2.getAllyMember().get(0).getId());
		System.out.println(ally2.getAllyMember().get(1).getId());
		in.close();
	}

	public static void readAllyAndMember() throws FileNotFoundException,
			IOException, ClassNotFoundException {
		Ally ally = new Ally();
		ally.setName("abc");
		AllyMember allyMemberA = new AllyMember();
		allyMemberA.setId(1);
		allyMemberA.setAlly(ally);
		AllyMember allyMemberB = new AllyMember();
		allyMemberB.setId(2);
		allyMemberB.setAlly(ally);
		ally.setAllyMember(new ArrayList<AllyMember>());
		ally.getAllyMember().add(allyMemberA);
		ally.getAllyMember().add(allyMemberB);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"objectFile2.obj"));
		out.writeObject(ally);
		out.writeObject(allyMemberA);
		out.writeObject(allyMemberB);
		out.flush();
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"objectFile2.obj"));
		Ally ally2 = (Ally) in.readObject();
		AllyMember allyMemberAcopy = (AllyMember) in.readObject();
		in.close();
		System.out.println(allyMemberAcopy == ally2.getAllyMember().get(0));
		System.out.println(allyMemberAcopy.getAlly() == ally2);

	}

	public static void readAndUpdateAllyAndMember()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		Ally ally = new Ally();
		ally.setName("abc");
		AllyMember allyMemberA = new AllyMember();
		allyMemberA.setId(1);
		allyMemberA.setAlly(ally);
		AllyMember allyMemberB = new AllyMember();
		allyMemberB.setId(2);
		allyMemberB.setAlly(ally);
		ally.setAllyMember(new ArrayList<AllyMember>());
		ally.getAllyMember().add(allyMemberA);
		ally.getAllyMember().add(allyMemberB);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"objectFile2.obj"));
		out.writeObject(ally);
		out.writeObject(allyMemberA);
		out.writeObject(allyMemberB);
		out.flush();
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"objectFile2.obj"));
		Ally ally2 = (Ally) in.readObject();
		ally2.getAllyMember().get(0).setId(3);
		AllyMember allyMemberAcopy = (AllyMember) in.readObject();
		in.close();
		System.out.println(allyMemberAcopy == ally2.getAllyMember().get(0));
		System.out.println(allyMemberAcopy.getAlly() == ally2);
		System.out.println(ally2.getAllyMember().get(0).getId());
		System.out.println(allyMemberAcopy.getId());

	}
}

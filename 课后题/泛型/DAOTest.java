package generic;

import java.util.List;

public class DAOTest {
	public static void main(String[] args) {
		Dao<User> dao = new Dao<User>();
		
		dao.save("101", new User(1001, 34, "Jay"));
		dao.save("102", new User(1002, 20, "Bieber"));
		dao.save("103", new User(1003, 15, "Nick"));
		dao.save("104", new User(1004, 24, "Wang"));
		
		dao.update("103", new User(1005, 14, "Zhou"));
		dao.delete("102");
		List<User> list = dao.list();
		list.forEach(System.out::println);
	}
}

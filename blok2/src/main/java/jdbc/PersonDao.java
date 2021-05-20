package jdbc;

import java.util.List;

public class PersonDao {
    private static PersonDao instance = null;

    private PersonDao() {
    }

    public static PersonDao instance() {
        if (instance == null) {
            instance = new PersonDao();
        }
        return instance;
    }

  /*  public List<Person> findAll(){
        return exec
    }

*/


}

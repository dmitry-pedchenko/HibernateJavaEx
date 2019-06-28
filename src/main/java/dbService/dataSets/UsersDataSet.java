package dbService.dataSets;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class UsersDataSet implements Serializable {
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_names", unique = false, updatable = true)
    private String user_names;

    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet() {
    }

    public UsersDataSet(long id, String user_names) {
        this.setId(id);
        this.setName(user_names);

    }

    public UsersDataSet(String user_names) {
        this.setId(-1);
        this.setName(user_names);
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getName() {
        return user_names;
    }

    public void setName(String user_names) {
        this.user_names = user_names;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDataSet{" + "id= " + id + " name = " +
                user_names + "'" + "}";
    }
}

package theproject.org.springsecurity.jdbc.userdetails.springsecurityuserdetails;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

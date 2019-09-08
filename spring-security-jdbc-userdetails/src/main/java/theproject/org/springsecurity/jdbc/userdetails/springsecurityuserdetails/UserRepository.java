package theproject.org.springsecurity.jdbc.userdetails.springsecurityuserdetails;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findByUsername(String username);
}

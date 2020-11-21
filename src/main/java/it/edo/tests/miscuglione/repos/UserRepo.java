package it.edo.tests.miscuglione.repos;

import it.edo.tests.miscuglione.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}

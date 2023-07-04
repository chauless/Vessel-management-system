package shipproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shipproject.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, String> {
}

package Company.UserManagement.repository;

import Company.UserManagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
// nos permite interactuar con los datos de la entidad.
public interface UsersRepository extends JpaRepository<Users,Long> {

}

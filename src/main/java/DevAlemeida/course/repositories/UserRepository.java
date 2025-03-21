package DevAlemeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import DevAlemeida.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

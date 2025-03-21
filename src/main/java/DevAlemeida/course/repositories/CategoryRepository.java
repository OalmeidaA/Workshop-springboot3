package DevAlemeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import DevAlemeida.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package DevAlemeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import DevAlemeida.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

package one.digitalinnovation.project.productcatalog.repository;

import one.digitalinnovation.project.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}

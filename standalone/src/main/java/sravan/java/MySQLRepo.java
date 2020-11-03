package sravan.java;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLRepo extends JpaRepository<Product, Integer> {

}

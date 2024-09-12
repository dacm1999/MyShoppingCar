package com.dacm.shopping_car.persistence;

import com.dacm.shopping_car.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDBRepository extends JpaRepository<Producto, Long> {
}

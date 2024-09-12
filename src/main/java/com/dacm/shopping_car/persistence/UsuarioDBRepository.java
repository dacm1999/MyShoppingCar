package com.dacm.shopping_car.persistence;

import com.dacm.shopping_car.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDBRepository extends JpaRepository<Usuario, Long> {
}

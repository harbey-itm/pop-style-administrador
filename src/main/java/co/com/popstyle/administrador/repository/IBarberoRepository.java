package co.com.popstyle.administrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.popstyle.administrador.entity.BarberoEntity;

@Repository
public interface IBarberoRepository extends JpaRepository<BarberoEntity, Integer> {

}

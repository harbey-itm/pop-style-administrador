package co.com.popstyle.administrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.popstyle.administrador.entity.HorarioBarberoEntity;
import co.com.popstyle.administrador.entity.HorarioBarberoKeyEntity;

@Repository
public interface IHorarioBarberoRepository extends JpaRepository<HorarioBarberoEntity, HorarioBarberoKeyEntity>{

}

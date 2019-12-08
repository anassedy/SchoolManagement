package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entites.Salle;

public interface ISalleRepository extends JpaRepository<Salle, Long> {

}

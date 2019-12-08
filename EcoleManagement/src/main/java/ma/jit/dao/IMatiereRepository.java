package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entites.Matiere;

public interface IMatiereRepository extends JpaRepository<Matiere, Long> {

}

package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entites.Professeur;

public interface IProfesseurRepository extends JpaRepository<Professeur, Long> {

}

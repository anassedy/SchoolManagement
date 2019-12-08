package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entites.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

}

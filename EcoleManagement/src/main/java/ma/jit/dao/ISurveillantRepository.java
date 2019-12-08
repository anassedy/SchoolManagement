package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entites.SurveillantGeneral;

public interface ISurveillantRepository extends JpaRepository<SurveillantGeneral, Long> {

}

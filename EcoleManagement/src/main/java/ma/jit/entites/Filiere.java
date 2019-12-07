package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Filiere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY )
	private List<Etudiant> etudiant;
	@OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY )
	private List<Professeur> professeur;
	@OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY )
	private List<Salle> salle;
	@OneToOne
	private SurveillantGeneral surveillant;
	@OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY )
	private List<Matiere> matiere;
}

package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Salle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int numero;
	@ManyToMany
	private List<Professeur> professeur;
	@ManyToMany
	private List<Etudiant> etudiant;
	@ManyToOne
	private Matiere matiere;
	@ManyToOne
	private SurveillantGeneral surveillant;
	private int nombreDePlace;

	public Salle(String nom, int numero, List<Professeur> professeur, List<Etudiant> etudiant, Matiere matiere,
			SurveillantGeneral surveillant, int nombreDePlace) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.professeur = professeur;
		this.etudiant = etudiant;
		this.matiere = matiere;
		this.surveillant = surveillant;
		this.nombreDePlace = nombreDePlace;
	}

}

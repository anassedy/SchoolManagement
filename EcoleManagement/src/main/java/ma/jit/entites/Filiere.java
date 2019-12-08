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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Filiere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@OneToMany(mappedBy = "filiere", fetch = FetchType.LAZY)
	private List<Etudiant> etudiant;

	@OneToOne
	private SurveillantGeneral surveillant;
	@OneToMany(mappedBy = "filiere", fetch = FetchType.LAZY)
	private List<Matiere> matiere;
	private int masseHorraire;
	private double moyenneGenerle;
	private int classement;

	public Filiere(String nom, List<Etudiant> etudiant, SurveillantGeneral surveillant, List<Matiere> matiere,
			int masseHorraire, double moyenneGenerle, int classement) {
		super();
		this.nom = nom;
		this.etudiant = etudiant;
		this.surveillant = surveillant;
		this.matiere = matiere;
		this.masseHorraire = masseHorraire;
		this.moyenneGenerle = moyenneGenerle;
		this.classement = classement;
	}

}

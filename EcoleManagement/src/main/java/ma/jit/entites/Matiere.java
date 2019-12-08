package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Matiere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int horraire;
	@OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
	private List<Professeur> professeur;
	private double note;
	private double coefficient;
	@ManyToOne
	private Filiere filiere;
	@OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY)
	private List<Salle> salle;

	public Matiere(String nom, int horraire, List<Professeur> professeur, double note, double coefficient,
			Filiere filiere, List<Salle> salle) {
		super();
		this.nom = nom;
		this.horraire = horraire;
		this.professeur = professeur;
		this.note = note;
		this.coefficient = coefficient;
		this.filiere = filiere;
		this.salle = salle;
	}

}

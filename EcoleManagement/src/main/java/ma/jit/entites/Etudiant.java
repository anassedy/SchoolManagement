package ma.jit.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String num;
	private Date dateDenaissace;
	@OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
	private List<Professeur> professeur;
	@OneToOne
	private Filiere filiere;
	@OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
	private List<Salle> salle;
	public Etudiant(String nom, String prenom, String adresse, String num, Date dateDenaissace,
			List<Professeur> professeur, Filiere filiere, List<Salle> salle) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.num = num;
		this.dateDenaissace = dateDenaissace;
		this.professeur = professeur;
		this.filiere = filiere;
		this.salle = salle;
	}
	
	
	
	
}

package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurveillantGeneral extends Employe implements Serializable {

	@OneToOne
	private Directeur directeur;

	@OneToMany(mappedBy = "surveillant", fetch = FetchType.LAZY)
	private List<Filiere> filiere;

	@OneToMany(mappedBy = "surveillant", fetch = FetchType.LAZY)
	private List<Salle> salle;

	@OneToMany(mappedBy = "surveillant", fetch = FetchType.LAZY)
	private List<Professeur> professeur;

	@OneToMany(mappedBy = "surveillant", fetch = FetchType.LAZY)
	private List<Etudiant> etudiant;

	public SurveillantGeneral(@NotNull String nom, @NotNull String prenom, @NotNull String cin, @NotNull int tel,
			@NotNull String email, @NotNull String adresse, @NotNull double salaire, @NotNull String sexe,
			Directeur directeur, List<Filiere> filiere, List<Salle> salle, List<Professeur> professeur,
			List<Etudiant> etudiant) {
		super(nom, prenom, cin, tel, email, adresse, salaire, sexe);
		this.directeur = directeur;
		this.filiere = filiere;
		this.salle = salle;
		this.professeur = professeur;
		this.etudiant = etudiant;
	}



}

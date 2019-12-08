package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professeur extends Employe implements Serializable {

	@OneToOne
	private Matiere matiere;
	@ManyToMany
	private List<Salle> salle;
	@ManyToMany
	private List<Etudiant> etudiant;
	@OneToOne
	private SurveillantGeneral surveillant;
	public Professeur(@NotNull String nom, @NotNull String prenom, @NotNull String cin, @NotNull int tel,
			@NotNull String email, @NotNull String adresse, @NotNull double salaire, @NotNull String sexe,
			Matiere matiere, List<Salle> salle, List<Etudiant> etudiant, SurveillantGeneral surveillant) {
		super(nom, prenom, cin, tel, email, adresse, salaire, sexe);
		this.matiere = matiere;
		this.salle = salle;
		this.etudiant = etudiant;
		this.surveillant = surveillant;
	}


}

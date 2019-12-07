package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private Filiere filiere;
	@OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY)
	private List<Salle> salle;
	
	
	public Professeur(@NotNull String nom, @NotNull String prenom, @NotNull String cin, @NotNull int tel,
			@NotNull String email, @NotNull String adresse, @NotNull double salaire, @NotNull String sexe,
			Filiere filiere, List<Salle> salle) {
		super(nom, prenom, cin, tel, email, adresse, salaire, sexe);
		this.filiere = filiere;
		this.salle = salle;
	}
	
	

	
	

	
	

}

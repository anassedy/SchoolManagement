package ma.jit.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Directeur extends Employe implements Serializable {
	
	@OneToMany(mappedBy = "directeur" , fetch = FetchType.LAZY)
	private List<SurveillantGeneral> surveillant;

	public Directeur(@NotNull String nom, @NotNull String prenom, @NotNull String cin, @NotNull int tel,
			@NotNull String email, @NotNull String adresse, @NotNull double salaire, @NotNull String sexe,
			List<SurveillantGeneral> surveillant) {
		super(nom, prenom, cin, tel, email, adresse, salaire, sexe);
		this.surveillant = surveillant;
	}


	
	

	
	
	
	

}

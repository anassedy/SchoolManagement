package ma.jit.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract  class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@NotNull
	protected String nom;
	@NotNull
	protected String prenom;
	@NotNull
	protected String cin;
	@NotNull
	protected int tel;
	@NotNull
	protected String email;
	@NotNull
	protected String adresse;
	@NotNull
	protected double salaire;
	@NotNull
	protected String sexe;
	public Employe(@NotNull String nom, @NotNull String prenom, @NotNull String cin, @NotNull int tel,
			@NotNull String email, @NotNull String adresse, @NotNull double salaire, @NotNull String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.tel = tel;
		this.email = email;
		this.adresse = adresse;
		this.salaire = salaire;
		this.sexe = sexe;
	}
	
	

	
	
	

	
	

}

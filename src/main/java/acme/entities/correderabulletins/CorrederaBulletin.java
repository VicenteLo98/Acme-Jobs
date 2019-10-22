
package acme.entities.correderabulletins;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CorrederaBulletin extends DomainEntity {

	public static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				nombre;

	@NotBlank
	private String				fundador;

}

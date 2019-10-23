
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RuizBulletin extends DomainEntity {

	public static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				job;

	@NotBlank
	private String				company;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}

package bp.common.model;

import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import java.util.Date;

/**
 * This class represents the Obstacle Construction and is used to stored
 */
@Entity
@Table(name="obs_construction")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

public class  Construction extends Obstacle implements IObstacle{
	/**
	 * attribute size describe the size in m2 of a construction
	 */
	@EditableAttribute("Size")
	private double size;

	@EditableAttribute("Valid Until")
	private Date validUntil;

	public Construction(){
	}

	public String getTypeName() {
		return "Construction";
	}

	public Construction(String name, double longitude, double latitude, double size, Date date) {
		super(name, ObstacleTypes.CONSTRUCTION, longitude, latitude);
		this.size = size;
		this.validUntil = date;
	}

	public double getSize() {
		return size;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
}
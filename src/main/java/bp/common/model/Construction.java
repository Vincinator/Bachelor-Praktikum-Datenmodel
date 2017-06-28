package bp.common.model;

import bp.common.model.annotations.EditableAttribute;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * This class represents the Obstacle Construction and is used to stored
 */
@Entity
@DiscriminatorValue("Construction")
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
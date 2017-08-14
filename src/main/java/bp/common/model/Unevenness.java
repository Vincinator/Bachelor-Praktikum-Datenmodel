package bp.common.model;


import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="obs_unevenness")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Unevenness extends Obstacle implements IObstacle {

	@EditableAttribute("Unevenness length")
	private double length;

	public Unevenness(){

	}

	public String getTypeName() {
		return "Unevenness";
	}

	public Unevenness(String name, double longitude, double latitude, double length){
		super(name, ObstacleTypes.UNEVENNESS, longitude, latitude);
		this.length = length;
	}

	public double getLength() {
        return length;
    }

    public void setLength(double num) {
        this.length = num;
    }
}
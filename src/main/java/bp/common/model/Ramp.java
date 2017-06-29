package bp.common.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="obs_ramp")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class Ramp extends Obstacle implements IObstacle{

	public Ramp(){
	}

	public Ramp(String name, double longitude, double latitude){
		super(name, ObstacleTypes.RAMP, longitude, latitude);
	}

	@Override
	public String getTypeName() {
		return "Ramp";
	}
}
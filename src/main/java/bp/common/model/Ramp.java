package bp.common.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="obs_ramp")
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
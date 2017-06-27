package bp.common.model;

public class  Ramp extends Obstacle implements IObstacle{

	public Ramp(){
	}

	public Ramp(String name, double longitude, double latitude){
		super(name, ObstacleTypes.RAMP, longitude, latitude);
	}
}
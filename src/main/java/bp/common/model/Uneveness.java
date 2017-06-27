package bp.common.model;


public class Uneveness extends Obstacle implements IObstacle {
	private double length;

	public Uneveness(){

	}

	public String getTypeName() {
		return "Uneveness";
	}

	public Uneveness(String name, double longitude, double latitude, double length){
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
package bp.common.model;

public class Stairs extends Obstacle {
	private int numberOfStairs;
    private int heightOfStairs;
	private boolean handleAvailable;

	public Stairs(){

	}

	public Stairs(String name, double longitude, double latitude, int numberOfStairs,int heightOfStairs, boolean handleAvailable){
		super(name, ObstacleTypes.STAIRS, longitude, latitude);
		this.numberOfStairs = numberOfStairs;
        this.heightOfStairs = heightOfStairs;
		this.handleAvailable = handleAvailable;
	}

	public int getNumberOfStairs() {
        return numberOfStairs;
    }

    public void setNumberOfStairs(int num) {
        this.numberOfStairs = num;
    }

    public boolean getHandleAvailable() {
        return handleAvailable;
    }

    public void setHandleAvailable(boolean bool) {
        this.handleAvailable = bool;
    }


    public int getHeightOfStairs() {
        return heightOfStairs;
    }

    public void setHeightOfStairs(int heightOfStairs) {
        this.heightOfStairs = heightOfStairs;
    }
}
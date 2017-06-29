package bp.common.model;

import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="obs_stairs")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

public class Stairs extends Obstacle implements IObstacle{

    @EditableAttribute("numberOfStairs")
	private int numberOfStairs;

    @EditableAttribute("heightOfStairs")
    private int heightOfStairs;

    @EditableAttribute("handleAvailable")
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

    public int getHeightOfStairs() {return heightOfStairs;}

    public void setHeightOfStairs(int heightOfStairs) {this.heightOfStairs = heightOfStairs;}

    @Override
    public String getTypeName() {
        return "Stairs";
    }
}
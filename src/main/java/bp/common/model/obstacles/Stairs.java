package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "stairs")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Stairs extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.STAIRS;
    @EditableAttribute("numberOfStairs")
    private int numberOfStairs;
    @EditableAttribute("heightOfStairs")
    private int heightOfStairs;
    @EditableAttribute("handleAvailable")
    private boolean handleAvailable;

    public Stairs() {

    }

    public Stairs(String name, double longitude, double latitude, int numberOfStairs, int heightOfStairs, boolean handleAvailable) {
        super(name, longitude, latitude);
        this.numberOfStairs = numberOfStairs;
        this.heightOfStairs = heightOfStairs;
        this.handleAvailable = handleAvailable;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
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

    @JsonIgnore
    @Override
    public String getTypeName() {
        return "Stairs";
    }
}
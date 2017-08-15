package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "stairs")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Stairs extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.STAIRS;
    @EditableAttribute("mNumberOfStairs")
    private int mNumberOfStairs;
    @EditableAttribute("mHeightOfStairs")
    private int mHeightOfStairs;
    @EditableAttribute("mHandleAvailable")
    private boolean mHandleAvailable;

    public Stairs() {

    }

    public Stairs(String name, double longitude, double latitude, int numberOfStairs, int heightOfStairs, boolean handleAvailable) {
        super(name, longitude, latitude);
        this.mNumberOfStairs = numberOfStairs;
        this.mHeightOfStairs = heightOfStairs;
        this.mHandleAvailable = handleAvailable;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public int getNumberOfStairs() {
        return mNumberOfStairs;
    }

    public void setNumberOfStairs(int num) {
        this.mNumberOfStairs = num;
    }

    public boolean getHandleAvailable() {
        return mHandleAvailable;
    }

    public void setHandleAvailable(boolean bool) {
        this.mHandleAvailable = bool;
    }

    public int getHeightOfStairs() {
        return mHeightOfStairs;
    }

    public void setHeightOfStairs(int heightOfStairs) {
        this.mHeightOfStairs = heightOfStairs;
    }


}
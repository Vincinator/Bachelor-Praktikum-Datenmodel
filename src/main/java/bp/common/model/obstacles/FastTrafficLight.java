package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Bi Banh Bao on 18.05.2017.
 */
@Entity
@DiscriminatorValue(value = "fasttrafficlight")

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class FastTrafficLight extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.FAST_TRAFFIC_LIGHT;
    /**
     * mDuration of the traffic light in seconds
     */
    @EditableAttribute("Duration")
    private int mDuration;

    public FastTrafficLight() {
    }

    public FastTrafficLight(String name, double longitude_start, double latitude_start, double longitude_end, double latitude_end, int mDuration) {
        super(name, longitude_start, latitude_start, longitude_end,latitude_end);
        this.mDuration = mDuration;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public int getDuration() {
        return mDuration;
    }

    public void setDuration(int mDuration) {
        this.mDuration = mDuration;
    }
}

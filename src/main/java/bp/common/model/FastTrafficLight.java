package bp.common.model;

import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Bi Banh Bao on 18.05.2017.
 */
@Entity
@Table(name = "obs_fasttrafficLight")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

public class FastTrafficLight extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.FAST_TRAFFIC_LIGHT;
    /**
     * duration of the traffic light in seconds
     */
    @EditableAttribute("Duration")
    private int duration;

    public FastTrafficLight() {
    }

    public FastTrafficLight(String name, double longitude, double latitude, int duration) {
        super(name, longitude, latitude);
        this.duration = duration;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return "FastTrafficLight";
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

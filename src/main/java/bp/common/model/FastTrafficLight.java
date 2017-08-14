package bp.common.model;

import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 * Created by Bi Banh Bao on 18.05.2017.
 */
@Entity
@Table(name="obs_fasttrafficLight")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")

public class FastTrafficLight extends Obstacle implements IObstacle {
    /**
     * duration of the traffic light in seconds
     */
    @EditableAttribute("Duration")
    private int duration;

    public FastTrafficLight() {
    }

    public String getTypeName() {
        return "FastTrafficLight";
    }

    public FastTrafficLight(String name, double longitude, double latitude, int duration) {
        super(name, ObstacleTypes.FAST_TRAFFIC_LIGHT, longitude, latitude);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

package bp.common.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "obs_ramp")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class Ramp extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.RAMP;

    public Ramp() {
    }

    public Ramp(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }


    @Override
    public String getTypeName() {
        return "Ramp";
    }
}
package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "ramp")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Ramp extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.RAMP;


    public Ramp() {
    }

    public Ramp(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    @Override
    public String getTypeName() {
        return "Ramp";
    }
}
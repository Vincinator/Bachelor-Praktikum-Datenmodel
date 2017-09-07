package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Bi Banh Bao on 18.05.2017
 * this class represents Elevator on the street, which helps disable people mobilize.
 */
@Entity
@DiscriminatorValue(value = "elevator")

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class Elevator extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.ELEVATOR;
    public Elevator() {

    }

    public Elevator(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

}

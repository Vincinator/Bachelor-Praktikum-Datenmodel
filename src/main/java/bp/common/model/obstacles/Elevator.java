package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Bi Banh Bao on 18.05.2017
 * this class represents Elevator on the street, which helps disable people mobilize.
 */
@Entity
@DiscriminatorValue(value = "Elevator")

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class Elevator extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.ELEVATOR;
    /**
     * attribute from and to describe the 2 streets the elevator connects
     */
    @EditableAttribute("From")
    private String from;
    @EditableAttribute("To")
    private String to;

    public Elevator() {

    }

    public Elevator(String name, double longitude, double latitude, String from, String to) {
        super(name, longitude, latitude);
        this.from = from;
        this.to = to;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTypeName() {
        return "Elevator";
    }
}

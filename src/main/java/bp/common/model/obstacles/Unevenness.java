package bp.common.model.obstacles;


import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "unevenness")

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Unevenness extends Obstacle implements IObstacle {


    public ObstacleTypes typeCode = ObstacleTypes.UNEVENNESS;
    @EditableAttribute("Unevenness length")
    private double length;

    public Unevenness() {

    }

    public Unevenness(String name, double longitude, double latitude, double length) {
        super(name, longitude, latitude);
        this.length = length;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return "Unevenness";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double num) {
        this.length = num;
    }
}
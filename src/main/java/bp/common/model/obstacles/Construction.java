package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * This class represents the Obstacle Construction and is used to stored
 */
@Entity
@DiscriminatorValue("CONSTRUCTION")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class Construction extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.CONSTRUCTION;
    /**
     * attribute size describe the size in m2 of a construction
     */
    @EditableAttribute("Size")
    private double size;
    @EditableAttribute("Valid Until")
    private Date validUntil;

    public Construction() {
    }

    public Construction(String name, double longitude, double latitude, double size, Date date) {
        super(name, longitude, latitude);
        this.size = size;
        this.validUntil = date;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return "Construction";
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
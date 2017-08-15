package bp.common.model.obstacles;

import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Bi Banh Bao on 18.05.2017.
 * this class represents tight passgage through which disable people with wheelchair
 * are not able to pass.
 */
@Entity
@DiscriminatorValue("TIGHTPASSAGE")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class TightPassage extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.TIGHT_PASSAGE;
    /**
     * the width of the passage
     */
    @EditableAttribute("Passage width")
    private double width;
    @EditableAttribute("Passage smaller Than 90cm")
    private boolean smallerThan90cm;
    public TightPassage() {
    }

    public TightPassage(String name, double longitude, double latitude, double width, boolean smallerThan90cm) {
        super(name, longitude, latitude);
        this.width = width;
        this.smallerThan90cm = smallerThan90cm;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return "Tight Passage";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isSmallerThan90cm() {
        return smallerThan90cm;
    }

    public void setSmallerThan90cm(boolean smallerThan90cm) {
        this.smallerThan90cm = smallerThan90cm;
    }
}

package bp.common.model;

import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 * Created by Bi Banh Bao on 18.05.2017.
 * this class represents tight passgage through which disable people with wheelchair
 * are not able to pass.
 */
@Entity
@Table(name="obs_tightpassage")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")

public class TightPassage extends Obstacle implements IObstacle {
    /**
     * the width of the passage
     */
    @EditableAttribute("Passage width")
    private double width;
    @EditableAttribute("Passage smaller Than 90cm")
    private boolean smallerThan90cm;

    public TightPassage() {
    }

    public String getTypeName() {
        return "Tight Passage";
    }

    public TightPassage(String name, double longitude, double latitude, double width, boolean smallerThan90cm) {
        super(name, ObstacleTypes.TIGHT_PASSAGE, longitude, latitude);
        this.width = width;
        this.smallerThan90cm = smallerThan90cm;
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

package bp.common.model.obstacles;

import bp.common.model.AttributeTypes;
import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "stairs")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Stairs extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.STAIRS;
    @EditableAttribute(name = "Where the Stairs lead in the Direction of the Way", type = AttributeTypes.DROPDOWN, validoptions = "up,down")
    private String incline;
    @EditableAttribute(name = "Number of Stairs", type = AttributeTypes.INTEGER)
    private int mNumberOfStairs;
    @EditableAttribute(name = "Handrail Available", type = AttributeTypes.DROPDOWN, validoptions = "yes,no")
    private String handrail;
    @EditableAttribute(name = "Tactile Paving Available", type = AttributeTypes.DROPDOWN, validoptions = "yes,no,contrasted,primitive,incorrect")
    private String tactile_paving;
    @EditableAttribute(name = "Tactile Paving Available", type = AttributeTypes.DROPDOWN, validoptions = "yes,no,contrasted,primitive,incorrect")
    private String tactile_writing;
    @EditableAttribute(name = "Ramp Available", type = AttributeTypes.DROPDOWN, validoptions = "yes,no")
    private String ramp;
    @EditableAttribute(name = "Ramp Available for Stroller", type = AttributeTypes.DROPDOWN, validoptions = "yes,limited,no")
    private String ramp_stroller;
    @EditableAttribute(name = "Ramp Available for Wheelchair", type = AttributeTypes.DROPDOWN, validoptions = "yes,limited,no,designated")
    private String ramp_wheelchair;
    @EditableAttribute(name = "Width in meters", type = AttributeTypes.DOUBLE)
    private double width;


    public Stairs() {

    }

    public Stairs(String name, double longitude_start, double latitude_start,double longitude_end, double latitude_end,  int numberOfStairs, String handrail) {
        super(name, longitude_start, latitude_start, longitude_end,latitude_end);
        this.mNumberOfStairs = numberOfStairs;
        this.handrail = handrail;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(ObstacleTypes typeCode) {
        this.typeCode = typeCode;
    }

    public int getmNumberOfStairs() {
        return mNumberOfStairs;
    }

    public void setmNumberOfStairs(int mNumberOfStairs) {
        this.mNumberOfStairs = mNumberOfStairs;
    }

    public String getHandrail() {
        return handrail;
    }

    public void setHandrail(String handrail) {
        this.handrail = handrail;
    }

    public String getTactile_paving() {
        return tactile_paving;
    }

    public void setTactile_paving(String tactile_paving) {
        this.tactile_paving = tactile_paving;
    }

    public String getRamp() {
        return ramp;
    }

    public void setRamp(String ramp) {
        this.ramp = ramp;
    }

    public String getIncline() {
        return incline;
    }

    public void setIncline(String incline) {
        this.incline = incline;
    }

    public String getTactile_writing() {
        return tactile_writing;
    }

    public void setTactile_writing(String tactile_writing) {
        this.tactile_writing = tactile_writing;
    }

    public String getRamp_stroller() {
        return ramp_stroller;
    }

    public void setRamp_stroller(String ramp_stroller) {
        this.ramp_stroller = ramp_stroller;
    }

    public String getRamp_wheelchair() {
        return ramp_wheelchair;
    }

    public void setRamp_wheelchair(String ramp_wheelchair) {
        this.ramp_wheelchair = ramp_wheelchair;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
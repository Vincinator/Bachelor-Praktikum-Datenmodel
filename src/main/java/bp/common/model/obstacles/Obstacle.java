package bp.common.model.obstacles;


import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

/**
 * Created by Bi on 18.05.2017.
 */
@Entity
@Table(name = "OBSTACLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OBSTACLE_TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("dummy")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Stairs.class, name = "construction"),
        @JsonSubTypes.Type(value = Stairs.class, name = "elevator"),
        @JsonSubTypes.Type(value = Stairs.class, name = "fasttrafficlight"),
        @JsonSubTypes.Type(value = Stairs.class, name = "ramp"),
        @JsonSubTypes.Type(value = Stairs.class, name = "stairs"),
        @JsonSubTypes.Type(value = Stairs.class, name = "tightpassage"),
        @JsonSubTypes.Type(value = Stairs.class, name = "unevenness")})
public abstract class Obstacle {

    @EditableAttribute("Name")
    public String mName;
    //@EditableAttribute("longitude")
    public double longitude = 49.874978;
    //@EditableAttribute("latitude")
    public double latitude = 8.655971;

    @TableGenerator(name = "OBSTACLE_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "OBSTACLE_GEN")
    private long id;


    public Obstacle() {

    }

    public Obstacle(String mName, double longitude, double latitude) {
        this.mName = mName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public abstract ObstacleTypes getTypeCode();

    public abstract String getTypeName();

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}

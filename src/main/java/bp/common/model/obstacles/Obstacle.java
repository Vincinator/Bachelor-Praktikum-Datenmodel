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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
    public String name;
    //@EditableAttribute("longitude")
    public double longitude = 49.874978;
    //@EditableAttribute("latitude")
    public double latitude = 8.655971;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public Obstacle() {

    }

    public Obstacle(String name, double longitude, double latitude) {
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

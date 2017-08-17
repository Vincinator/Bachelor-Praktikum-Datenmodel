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
        @JsonSubTypes.Type(value = Construction.class, name = "construction"),
        @JsonSubTypes.Type(value = Elevator.class, name = "elevator"),
        @JsonSubTypes.Type(value = FastTrafficLight.class, name = "fasttrafficlight"),
        @JsonSubTypes.Type(value = Ramp.class, name = "ramp"),
        @JsonSubTypes.Type(value = Stairs.class, name = "stairs"),
        @JsonSubTypes.Type(value = TightPassage.class, name = "tightpassage"),
        @JsonSubTypes.Type(value = Unevenness.class, name = "unevenness")})
public abstract class Obstacle {

    @EditableAttribute("Name")
    public String mName;
    //@EditableAttribute("longitude")
    public double longitude = 49.874978;
    //@EditableAttribute("latitude")
    public double latitude = 8.655971;

    /**
     * osm id of the way this obstacle is on
     */
    public long id_way;
    /**
     * 2 ids of 2 nodes which this Obstacle lies between
     */
    public long id_firstnode;
    public long id_lastnode;

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

    public long getId_way() {
        return id_way;
    }

    public void setId_way(long id_way) {
        this.id_way = id_way;
    }

    public long getId_firstnode() {
        return id_firstnode;
    }

    public void setId_firstnode(long id_firstnode) {
        this.id_firstnode = id_firstnode;
    }

    public long getId_lastnode() {
        return id_lastnode;
    }

    public void setId_lastnode(long id_lastnode) {
        this.id_lastnode = id_lastnode;
    }
}

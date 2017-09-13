package bp.common.model.ways;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

/**
 * Class used by Jackson and Hibernate
 * Created by Bi on 01.09.2017.
 */
@Entity
@Table(name = "NODES")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Node {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long osm_id;
    private double longitude = 49.874978;
    private double latitude = 8.655971;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "way_id")
    @JsonBackReference
    private Way way;

    public Node(){}
    /**
     * specify lat and long when creating an object
     * @param latitude
     * @param longitude
     */
    public Node(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
    }

    public long getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(long osm_id) {
        this.osm_id = osm_id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}

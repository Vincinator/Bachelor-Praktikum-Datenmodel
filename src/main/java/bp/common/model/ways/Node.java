package bp.common.model.ways;

import javax.persistence.*;

/**
 * Class used by Jackson and Hibernate
 * Created by Bi on 01.09.2017.
 */
@Entity
@Table(name = "NODES")
public class Node {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private double longitude = 49.874978;
    private double latitude = 8.655971;

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

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}

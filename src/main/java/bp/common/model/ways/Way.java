package bp.common.model.ways;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used by Jackson and Hibernate
 */
@Entity
@Table(name = "WAYS")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Way {
    boolean alreadyExported = false;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long id;
    private long osm_id;
    /**
     * The name of the road to display in the details view of the road.
     */
    public String name = "";

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "way",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference("way-nodes")
    private List<Node> nodes;
    private long osmid_firstWay;
    private long osmid_firstWayFirstNode;
    private long osmid_firstWaySecondNode;
    private long osmid_secondWay;
    private long osmid_secondWayFirstNode;
    private long osmid_secondWaySecondNode;

    /**
     * value of highway tags
     */
    public String highway= "*";
    @Column(columnDefinition="TEXT")
    public String additionalTags = "";

    public boolean isObstacle = false;

    /**
     * list of node instead of GeoPoint
     */

    public Way(){}
    /**
     * Contructor for Way Object
     * @param name name of the street
     * @param nodes a list of nodes which this street is composed of
     */
    public Way(String name, List<Node> nodes) {
        this.name = name;
        this.nodes = nodes;
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

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getHighway() {
        return highway;
    }

    public void setHighway(String highway) {
        this.highway = highway;
    }

    public long getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(long osm_id) {
        this.osm_id = osm_id;
    }

    public long getOsmid_firstWay() {
        return osmid_firstWay;
    }

    public void setOsmid_firstWay(long osmid_firstWay) {
        this.osmid_firstWay = osmid_firstWay;
    }

    public long getOsmid_firstWayFirstNode() {
        return osmid_firstWayFirstNode;
    }

    public void setOsmid_firstWayFirstNode(long osmid_firstWayFirstNode) {
        this.osmid_firstWayFirstNode = osmid_firstWayFirstNode;
    }

    public long getOsmid_firstWaySecondNode() {
        return osmid_firstWaySecondNode;
    }

    public void setOsmid_firstWaySecondNode(long osmid_firstWaySecondNode) {
        this.osmid_firstWaySecondNode = osmid_firstWaySecondNode;
    }

    public long getOsmid_secondWay() {
        return osmid_secondWay;
    }

    public void setOsmid_secondWay(long osmid_secondWay) {
        this.osmid_secondWay = osmid_secondWay;
    }

    public long getOsmid_secondWayFirstNode() {
        return osmid_secondWayFirstNode;
    }

    public void setOsmid_secondWayFirstNode(long osmid_secondWayFirstNode) {
        this.osmid_secondWayFirstNode = osmid_secondWayFirstNode;
    }

    public long getOsmid_secondWaySecondNode() {
        return osmid_secondWaySecondNode;
    }

    public void setOsmid_secondWaySecondNode(long osmid_secondWaySecondNode) {
        this.osmid_secondWaySecondNode = osmid_secondWaySecondNode;
    }

    public boolean isAlreadyExported() {
        return alreadyExported;
    }

    public void setAlreadyExported(boolean alreadyExported) {
        this.alreadyExported = alreadyExported;
    }

    public String getAdditionalTags() {
        return additionalTags;
    }

    public void setAdditionalTags(String additionalTags) {
        this.additionalTags = additionalTags;
    }



    @Override
    public String toString() {
        return "Way{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nodes=" + nodes +
                ", highway='" + highway + '\'' +
                '}';
    }
}

package bp.common.model.ways;

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
    public long id;
    /**
     * The name of the road to display in the details view of the road.
     */
    public String name = "";
    private ArrayList<Node> nodes = new ArrayList<Node>();
    /**
     * value of highway tags
     */
    public String highway= "*";
    /**
     * list of node instead of GeoPoint
     */

    public Way(){}
    /**
     * Contructor for Way Object
     * @param name name of the street
     * @param nodes a list of nodes which this street is composed of
     */
    public Way(String name, ArrayList<Node> nodes) {
        this.name = name;
        this.nodes = nodes;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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

    @OneToMany
    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public String getHighway() {
        return highway;
    }

    public void setHighway(String highway) {
        this.highway = highway;
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

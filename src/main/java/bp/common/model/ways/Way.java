package bp.common.model.ways;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Used for parsing the response from overpass api.
 *
 * Used by OsmParser
 */
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

    /**
     * Contructor for Way Object
     * @param name name of the street
     * @param nodes a list of nodes which this street is composed of
     */
    public Way(String name, ArrayList<Node> nodes) {
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
}

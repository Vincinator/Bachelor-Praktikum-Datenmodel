package bp.common.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Bi Banh Bao on 23.09.2017.
 */
@Entity
@Table(name = "WAYSBLACKLIST")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class WayBlacklist {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long id;
    private long osm_id;
    private int version;
    private int user_id;
    private Timestamp tstamp;
    private long changeset_id;
    private String tags;
    @ElementCollection
    @CollectionTable(name="Nodes", joinColumns = @JoinColumn(name="id"))
    @Column(name="nodes")
    private List<Long> nodes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(long osm_id) {
        this.osm_id = osm_id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Timestamp getTstamp() {
        return tstamp;
    }

    public void setTstamp(Timestamp tstamp) {
        this.tstamp = tstamp;
    }

    public long getChangeset_id() {
        return changeset_id;
    }

    public void setChangeset_id(long changeset_id) {
        this.changeset_id = changeset_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<Long> getNodes() {
        return nodes;
    }

    public void setNodes(List<Long> nodes) {
        this.nodes = nodes;
    }
}

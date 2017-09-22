package bp.common.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

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
}

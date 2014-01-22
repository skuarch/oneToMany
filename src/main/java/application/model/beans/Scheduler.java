package application.model.beans;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author skuarch
 */
@Entity
@Table(name = "scheduler")
public class Scheduler implements Serializable {

    @Id
    @Column(name = "scheduler_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "scheduler_name")
    private String name;   
    @OneToMany(mappedBy = "scheduler",cascade = CascadeType.ALL)      
    private Set<NetworkNode> nodes; 
    
    //==========================================================================
    public Scheduler() {
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

    public Set<NetworkNode> getNodes() {
        return nodes;
    }

    public void setNodes(Set<NetworkNode> nodes) {
        this.nodes = nodes;
    }
    
} // end class

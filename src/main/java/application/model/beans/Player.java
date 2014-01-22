package application.model.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author skuarch
 */
@Entity  
@Table(name = "player") 
public class Player implements Serializable {
    
    @Id  
    @GeneratedValue  
    private Integer id;  
  
    private String lastname;  
  
    @ManyToOne  
    @JoinColumn(name = "team_id")  
    private Team team; 

    public Player() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
}

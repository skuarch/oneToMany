package application.oneToMany;

import application.model.beans.NetworkNode;
import application.model.beans.Player;
import application.model.beans.Scheduler;
import application.model.beans.Team;
import application.model.dao.DAO;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        /*Team team = new Team();
        team.setName("Barcelona");
        Set<Player> players = new HashSet<Player>();

        Player p1 = new Player();
        p1.setLastname("Messi");
        Player p2 = new Player();
        p2.setLastname("Xavi");

        p1.setTeam(team);
        p2.setTeam(team);

        players.add(p1);
        players.add(p2);

        team.setPlayers(players);
        
        DAO.create(team);*/
        
        
        Scheduler scheduler = new Scheduler();
        scheduler.setName("one");
        
        Set<NetworkNode> nodes = new HashSet<NetworkNode>();
        
        NetworkNode n1 = new NetworkNode();
        n1.setName("n1");
        
        NetworkNode n2 = new NetworkNode();
        n2.setName("n2");
        
        n1.setScheduler(scheduler);
        n2.setScheduler(scheduler);

        nodes.add(n1);
        nodes.add(n2);
        
        scheduler.setNodes(nodes);
        
        DAO.create(scheduler);
        
        
        NetworkNode n3 = new NetworkNode();
        n3.setName("n3");
        
        n3.setScheduler(scheduler);
        
        DAO.create(n3);
        
    }
}

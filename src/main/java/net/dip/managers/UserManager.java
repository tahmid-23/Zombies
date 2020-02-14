package net.dip.managers;

import net.dip.objects.User;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;

    public UserManager(){
        users = new ArrayList<>();
    }

    public List<User> getUsers(){
        return users;
    }

    public void createUser(Player p){
        if(getUser(p) != null)
            return;

        User u = new User(p);
        users.add(u);
    }

    public User getUser(Player p){
        for(User u : getUsers()){
            if(u.getPlayer().equals(p))
                return u;
        }
        return null;
    }
}
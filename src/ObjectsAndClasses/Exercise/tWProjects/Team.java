package ObjectsAndClasses.Exercise.tWProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private User creator;

    private List<User> listOfMembers;

    public Team(String name, User creator) {
        this.name = name;
        this.creator = creator;
        this.listOfMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public User getCreator() {
        return creator;
    }

    public List<User> getListOfMembers() {
        return listOfMembers;
    }

    public int getSize() {
        return listOfMembers.size();
    }
}

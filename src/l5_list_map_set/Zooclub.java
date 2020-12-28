package l5_list_map_set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zooclub {
    private Map<Person, List<Pet>> club;

    public Zooclub() {
        this.club = new HashMap<Person, List<Pet>>() ;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }
}

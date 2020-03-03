package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
        HashMap<String, Person> group = new HashMap<>();
        for(Person person : people){
            group.put(person.getIdCode(), person);
        }
        return group;
    }

}

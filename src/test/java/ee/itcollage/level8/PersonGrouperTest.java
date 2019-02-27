package ee.itcollage.level8;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PersonGrouperTest {

    public static List<Person> testPeople = Lists.newArrayList(
            new Person("11111", "Great", "President"),
            new Person("22222", "Donald", "Duck"),
            new Person("33333", "Cristiano", "Ronaldo"));

    @Test
    public void grouping_people_by_id_code_divides_them_to_id_code_and_person_pairs() {
        Map<String, Person> map = PersonGrouper.groupPeopleByIdCode(testPeople);
        assertEquals(3, map.size());
        assertNull(map.get("-1"));
        Person person1 = map.get("11111");
        assertEquals("Great", person1.getFirstName());
        Person person2 = map.get("22222");
        assertEquals("Donald", person2.getFirstName());
        Person person3 = map.get("33333");
        assertEquals("Cristiano", person3.getFirstName());
    }
}
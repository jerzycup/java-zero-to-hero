package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        HashSet<Integer> result = new HashSet<>(numbers);
            return new ArrayList<>(result);
    }
}

package Homework2;

import java.util.ArrayList;

public interface SearchService {
    ArrayList<String> findLeapYearNames (ArrayList<AbstractAnimal> animals);
    ArrayList<AbstractAnimal> findOlderAnimal (ArrayList<AbstractAnimal> animals, int N);
    ArrayList<AbstractAnimal> findDuplicate (ArrayList<AbstractAnimal> animals);
}

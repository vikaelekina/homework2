package Homework2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {
    public ArrayList<String> findLeapYearNames (ArrayList<AbstractAnimal> animals){
        return animals.stream().filter(a -> a.getLocalDate().isLeapYear()).map(AbstractAnimal::getName).collect(Collectors.toCollection(ArrayList::new));
    };
    public ArrayList<String> findOlderAnimal (ArrayList<AbstractAnimal> animals, int N){
        return animals.stream().filter(a->a.getLocalDate().plusYears(N).isBefore(LocalDate.now())).map(AbstractAnimal::getName).collect(Collectors.toCollection(ArrayList::new));
    };
    public ArrayList<String> findDuplicate (ArrayList<AbstractAnimal> animals){
        Set<AbstractAnimal> elements = new HashSet<>();
        return animals.stream().filter(a->!elements.add(a)).map(AbstractAnimal::getName).collect(Collectors.toCollection(ArrayList::new));
    };
}

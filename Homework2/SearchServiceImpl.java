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
    public ArrayList<AbstractAnimal> findOlderAnimal (ArrayList<AbstractAnimal> animals, int N){
        return animals.stream().filter(a->a.getLocalDate().plusYears(N).isBefore(LocalDate.now())).collect(Collectors.toCollection(ArrayList::new));
    };
    public void findDuplicate (ArrayList<AbstractAnimal> animals){
        Set<AbstractAnimal> elements = new HashSet<>();
        System.out.println("\n"+"Дубликаты:");
        if (animals.stream().filter(a->!elements.add(a)).collect(Collectors.toCollection(ArrayList::new)).isEmpty()){
            System.out.println("Дубликаты не найдены");
        }
        else {
            animals.stream().filter(a->!elements.add(a)).forEach(AbstractAnimal::printAnimal);
        }
    };
}

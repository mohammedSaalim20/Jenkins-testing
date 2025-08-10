import java.util.*;

public class listIntersection {
    
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list2);
        Set<Integer> set2 = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();

        // Add all elements of list1 to set1
        for (Integer num : list1){
            if(set1.contains(num) && !set2.contains(num)){
                set2.add(num);
                intersection.add(num);
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 8, 9);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9, 10);

        List<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection: " + intersection);
    }
}

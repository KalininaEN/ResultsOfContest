import java.util.*;

public class ResultsOfContest {
    public static void main(String[] args) {

        Map<Student, Integer> studentsMap = new HashMap<>();

        Student student1 = new Student("Калинина", "Елена", "Николаевна", Arrays.asList(10, 10, 10, 5, 3));
        Student student2 = new Student("Фадеева", "Татьяна", "Александровна", Arrays.asList(10, 10, 8, 10, 9));
        Student student3 = new Student("Котеночкин", "Иван", "Алексеевич", Arrays.asList(9, 3, 5, 2, 6));
        Student student4 = new Student("Иванов", "Семен", "Семенович", Arrays.asList(10, 10, 10, 10, 7));

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (int i = 0; i < students.size(); i++) {
            int arithmeticMean = students.get(i).getArithmeticMean(students.get(i).getScore());
            studentsMap.put(students.get(i), arithmeticMean);

        }
        studentsMap.entrySet().stream()
                .sorted(Map.Entry.<Student, Integer>comparingByValue().reversed())
//                .limit(3);
                .forEach(System.out::println);
    }
}

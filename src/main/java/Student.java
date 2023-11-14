import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> score;

    public Student(String surname, String name, String patronymic, List<Integer> score) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public int getArithmeticMean(List<Integer> score) {
        int sumOfTotalPoints = 0;
        int countContest = 5;


        for (int i = 0; i < countContest; i++) {
            sumOfTotalPoints = sumOfTotalPoints + score.get(i);
        }
        return sumOfTotalPoints / countContest;
    }
}

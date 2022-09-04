package chapter_12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> retest = TestResults.getMakeUpGrades();

        for (Map.Entry student : retest.entrySet()) {
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = retest.get(student.getKey());

            System.out.println("First grade is : " + firstGrade);
            System.out.println("Second grade is : " + secondGrade);

            if (secondGrade > firstGrade){
                gradeBook.put((String) student.getKey(), secondGrade);
            }
        }

        System.out.println("Final Grades : ");
        gradeBook.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade : " + v));
    }
}

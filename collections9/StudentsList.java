package oop.tasks.collections9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentsList {
    private List<Student> studentList = new ArrayList<>();

    public StudentsList(Student... students) {
        this.studentList.addAll(Arrays.asList(students));
    }

    public void expulsionFromTheUniversity() {
        Iterator<Student> itr = this.studentList.iterator();
        if(!itr.hasNext()) {
            System.out.println("Students list is empty");
        }
        while (itr.hasNext()) {
            Student student = itr.next();
            if (student.getAverageMark() >= 3) {
                student.setStudyYear(student.getStudyYear() + 1);
            } else {
                itr.remove();
            }
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void printStudentsList(List<Student> students, int course) {
        Iterator<Student> itr = students.iterator();

        String result = "Students enrolled in " + course + " course: \n";
        while (itr.hasNext()) {
            Student student = itr.next();
            if (student.getStudyYear() == course) {
                result = result.concat(student.toString());
            }
        }

        System.out.println(result);
    }

    @Override
    public String toString() {
        Iterator<Student> itr = this.studentList.iterator();
        String result = "";
        while (itr.hasNext()) {
            result = result.concat(itr.next().toString());
        }
        return result;
    }
}

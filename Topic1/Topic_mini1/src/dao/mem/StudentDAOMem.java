package dao.mem;

import core.Student;
import dao.ISortStrategy;
import dao.IStudentDAO;
import dao.SelectionSortStrategy;

import java.util.Arrays;

public class StudentDAOMem implements IStudentDAO {
    public final int MAX = 100;
    private Student[] students;
    private int count;
    private ISortStrategy sortStrategy;

    public StudentDAOMem() {
        this.count = 0;
        this.students = new Student[MAX];
        this.sortStrategy = new SelectionSortStrategy();
    }

    @Override
    public void addStudent(Student student) {
        students[count] = student;
        count++;
    }

    @Override
    public Student removeStudent(int code) {
        for (int i = 0; i<count; i++){
            if (students[i].getCode() == code){
                return students[i];
                // xóa rồi thì sẽ kh trả vể student đc()
            }
        }
        return null;
    }

    @Override
    public void display() {
        System.out.printf("");
    }

    @Override
    public void sort() {
        this.sortStrategy.sort(this.students, this.count);
    }
    ;

    @Override
    public void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    ;
}

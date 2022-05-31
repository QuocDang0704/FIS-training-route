package dao.jdbc;

import dao.ISortStrategy;
import dao.IStudentDAO;
import dao.SelectionSortStrategy;
import core.Student;

public class StudentDAOJDBC implements IStudentDAO {
    public final int MAX = 100;
    private Student[] students;
    private int count;
    private ISortStrategy sortStrategy;

    public StudentDAOJDBC() {
        this.count = 0;
        this.students = new Student[MAX];
        this.sortStrategy = new SelectionSortStrategy();
    }

    @Override
    public void addStudent(Student student) {
        count++;
        students[count] = student;
    }

    @Override
    public Student removeStudent(int code) {
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

package dao;

import core.Student;

public interface IStudentDAO {
    void addStudent(Student student);

    Student removeStudent(int code);

    void display();

    void sort();

    void setSortStrategy(ISortStrategy sortStrategy);
}

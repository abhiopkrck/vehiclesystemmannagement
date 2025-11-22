#include <iostream>
#include <vector>
#include <string>

class Student {
private:
    int id;
    std::string name;
    float grade;

public:
    Student(int id, std::string name, float grade) : id(id), name(name), grade(grade) {}

    int getId() const {
        return id;
    }

    std::string getName() const {
        return name;
    }

    float getGrade() const {
        return grade;
    }

    void display() const {
        std::cout << "ID: " << id << ", Name: " << name << ", Grade: " << grade << std::endl;
    }
};

class StudentRecord {
private:
    std::vector<Student> students;

public:
    void addStudent(const Student& student) {
        students.push_back(student);
    }

    void displayAllStudents() const {
        for (const auto& student : students) {
            student.display();
        }
    }

    Student* findStudentById(int id) {
        for (auto& student : students) {
            if (student.getId() == id) {
                return &student;
            }
        }
        return nullptr;
    }
};

int main() {
    StudentRecord record;
    record.addStudent(Student(1, "John Doe", 85.5));
    record.addStudent(Student(2, "Jane Smith", 90.0));
    record.addStudent(Student(3, "Max Turner", 78.0));

    std::cout << "All students:" << std::endl;
    record.displayAllStudents();

    int searchId = 2;
    Student* student = record.findStudentById(searchId);
    if (student != nullptr) {
        std::cout << "\nFound student with ID " << searchId << ":" << std::endl;
        student->display();
    } else {
        std::cout << "\nStudent with ID " << searchId << " not found." << std::endl;
    }

    return 0;
}
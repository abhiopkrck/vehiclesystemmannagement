class Student:
    def __init__(self, student_id, name, age):
        self.student_id = student_id;
        self.name = name;
        self.age = age;
class StudentManagementSystem:
    def __init__(self):
        self.students = []

    def add_student(self, student):
        self.students.append(student);
    def remove_student(self, student_id):
        self.students = [student for student in self.students if student.student_id != student_id]

    def get_student(self, student_id):
        for student in self.students:
            if student.student_id == student_id:
                return student;
        return None;
    def display_students(self):
        for student in self.students:
            print(f"ID: {student.student_id}, Name: {student.name}, Age: {student.age}");
# Example usage;
sms = StudentManagementSystem();
sms.add_student(Student(1, "Alice", 20));
sms.add_student(Student(2, "Bob", 22));
sms.display_students();
sms.remove_student(1);
sms.display_students();
public class StudentManager {

    public void addStudent(Student student) {
        System.out.println(student.getName() + student.getLastName() + ": öğrenci oluşturuldu.");
    }

    public void studentList(Student[] students) {
        for(Student student : students) {
            System.out.println(student.getName() + " " + student.getLastName() );
        }
    }

    public void deleteStudent(Student students) {
        System.out.println(students.getName() +" " + students.getLastName() + " " + students.getEmail() + " : Bilgili öğrenci silindi.");
    }

    public void emailList(Student students) {
        System.out.println(students.getEmail() + " : Email bilgisi eklendi.");
    }

    public void showCourse(Student students) {
        System.out.println("-----" + students.getName() + " " + students.getLastName() + " isimli öğrencinin ders listesi -----"   );

        for(String course: students.getCourses()) {
            System.out.println(course);
        }


    }

}

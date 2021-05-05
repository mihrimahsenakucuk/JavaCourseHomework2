public class InstructorManager {

    public void add(Instructor instructor) {
        System.out.println(instructor.getName() + instructor.getLastName() +  ": Eğitmen eklendi.");

    }

    public void addLessons(Instructor instructor) {
        System.out.println(instructor.getName() + instructor.getLastName() + instructor.getLessons() + " : dersi oluşturuldu");
    }

    public void showLessons(Instructor instructor) {
        System.out.println("-----" + instructor.getName() + " " + instructor.getLastName() + "isimli eğitmenin verdiği dersler-----" );

        for(String lessons : instructor.getLessons()) {
            System.out.println(lessons);
        }
    }


}
package problem_set.OOPJava;

class Course {
    String nome;

    public Course(String nome) {
        this.nome = nome;
    }
}
class Student {
    String nome;
    Course course;  // Associação: Aluno "tem um" Curso

    public Student(String nome, Course course) {
        this.nome = nome;
        this.course = course;
    }

    public void showinfo() {
        System.out.println(nome + " is enrolled in " + course.nome);
    }
}
public class studentCourseMain {
    public static void main(String[] args) {
        Course courseJava = new Course("Basic Java");
        Student student = new Student("Maria", courseJava);

        student.showinfo();
    }
}


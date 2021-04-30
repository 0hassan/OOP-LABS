package Question_3;

abstract class Student{
    public abstract void exam();
}
class stdRunner{
    public static void main(String[] args) {
        PhDStudent phdstd=new PhDStudent("Hassan", "3234418", "3.1");
        GraduateStudent graduatestd=new GraduateStudent("Ali", "3256788", "3.3");
        phdstd.exam();
        graduatestd.exam();
    }
}
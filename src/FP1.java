class student{
    public void dispifo(String name,int clas,int rollno){
        System.out.println(name);
        System.out.println(clas);
        System.out.println(rollno);
    }
}
public class FP1 {
    public static void main(String[] args) {
        student obj=new student();
        obj.dispifo("Rishabh",10,45);
    }
}

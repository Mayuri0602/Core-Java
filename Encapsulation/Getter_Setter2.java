
    class Student{
        private int id;
        private String name;
        public Student(int id,String name){
            this.id=id;
            this.name=name;
    }
        int getid1(){
            return id;
        }
        String getname1(){
            return name;
        }
    }
    public class Getter_Setter2 {
    public static void main(String[] args) {
        Student s=new Student(14,"mannu");
        
System.out.println(s.getid1());
System.out.println(s.getname1());
    }
}

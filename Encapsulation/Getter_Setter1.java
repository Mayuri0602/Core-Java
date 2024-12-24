
    class Person{
        private String name;
        private int age;
        void setA(String name,int age){
            this.name=name;
            this.age=age;
        }
        String getname1(){
            return name;
        }
        int getage1(){
            return age;
        }
    }
    public class Getter_Setter1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setA("mayu",23);
        System.out.println(p.getname1());
        System.out.println(p.getage1());
    }
}

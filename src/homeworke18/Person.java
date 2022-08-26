package homeworke18;

public class Person {
    private String status;
    private String name;
    private  int age;

   public Person(String status,String name,int age){
       this.status=status;
       this.name=name;
       this.age=age;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

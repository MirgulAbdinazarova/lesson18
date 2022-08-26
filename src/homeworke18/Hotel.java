package homeworke18;

public class Hotel implements Payable {

     private Person[]families;

     public Hotel(Person[]families){
          this.families=families;
     }

     public void setFamilies(Person[] families) {
          this.families = families;
     }

     public void getFamilies() {
          for (Person i:families) {
               System.out.println(i.getStatus()+":"+i.getName()+" "+i.getAge()+" let");
          }
     }

     @Override
     public  void pay(){
          System.out.println("Hotelде жашагандар аренда толошот");
     }
}

package homeworke18;

public class Obshejitie  implements Payable {

     private Person[]families;

    public Obshejitie(Person[]families){
        this.families=families;
    }



    public void getFamilies() {
        for (Person i:families) {
            System.out.println(i.getStatus()+":"+i.getName()+" "+i.getAge()+" let");
        }
    }




    @Override
    public  void pay(){
         System.out.println("Общежитиеде жашагандар аренда толошот");
    }

}

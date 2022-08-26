package homeworke18;

public class Main {
    public static void main(String[] args){


       Person person1=new Person("mama","Ainura",40);
       Person person2=new Person("papa","Asan",43);
       Person person3=new Person("son","Bakyt",12);
        Person person4=new Person("mama","Begai",36);
        Person person5=new Person("papa","Tilek",39);
        Person person6=new Person("daughter","Samara",6);
        Person person7=new Person("papa","Dastan",32);
        Person person8=new Person("mama","Nuriya",30);

        Person[]families1={person1,person2,person3};
        Person[]families2={person4,person5,person6};
        Person[]families3={person7,person8};

        Kvartira kvartira=new Kvartira(families1);
        System.out.println("Kvartirada jashagandar:");
        kvartira.getFamilies();
        kvartira.pay();
        System.out.println("----------");
        Obshejitie obshejitie=new Obshejitie(families2);
        System.out.println("Obshejitiede jashagandar:");
        obshejitie.getFamilies();
        obshejitie.pay();
        System.out.println("------------");
        Hotel hotel=new Hotel(families3);
        System.out.println("Hotelde jashagandar:");
        hotel.getFamilies();
        hotel.pay();




    }
}

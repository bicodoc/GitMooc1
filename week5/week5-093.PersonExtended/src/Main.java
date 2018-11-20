public class Main {
  public static void main(String[] args) {
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );

    }
      
/*
        Person pekka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);
        Person al = new Person("Al", 16, 4, 1957);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
        System.out.println( al.getName() + " is older than " +  martin.getName() + ": "+ al.olderThan(martin) );
    }        
  

    // write test code here
    // Person pekka = new Person("Pekka", 15, 2, 1993);
*/
}

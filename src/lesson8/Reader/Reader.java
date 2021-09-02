package lesson8.Reader;

public class Reader {
    private String fullName;
    private int numberReadTicket;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader (){

    }

    public Reader (String fullName){
        this.fullName = fullName;
    }

    public Reader(String fullName,int numberReadTicket, String faculty, String birthDate,String phoneNumber){
        this.fullName = fullName;
        this.numberReadTicket = numberReadTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook (int countBooks){
        System.out.printf("\n%s взял %d книги\n",this.fullName,countBooks);
    }

    public void takeBook ( Book...books){
        System.out.print(fullName+" взял книги: ");
        for (Book a:books){
            System.out.print(a.getType()+", ");
        }
        //System.out.println();
    }

}

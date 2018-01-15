package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1989, 8, 8);
        
        Person person = new Person("Yeray", date);
        System.out.println(person.getName() + " tiene " +
                person.getAge() + " años");
    
    }
}

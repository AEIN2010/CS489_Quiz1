import Models.Contact;
import Models.Email;
import Models.Phone;

import java.util.ArrayList;
import java.util.List;

public class DummyDataGenerator {


    //this class is just to be used as if it is a database

    private static int counter = 0;
    protected static List<Contact> contacts = new ArrayList<Contact>();


    protected static boolean createDummyData(){

        if(counter == 0){
            contacts.add(new Contact("Davied",
                    "Sanger",
                    "Argos LLC",
                    "Sales Manager",
                    new ArrayList<Phone>(),
                    new ArrayList<Email>()
            ));

            contacts.get(0).getPhones().add(new Phone("240-133-0011",
                    "Home"));
            contacts.get(0).getPhones().add(new Phone("240-112-0123",
                    "Mobile"));
            contacts.get(0).getEmails().add(new Email("dave.sang@gmail.com","Home"));
            contacts.get(0).getEmails().add(new Email("dsanger@argos.com","Home"));




            contacts.add(new Contact("Carlos",
                    "Jimenez",
                    "Zappos",
                    "Director",
                    new ArrayList<Phone>(),
                    new ArrayList<Email>()
            ));


            contacts.add(new Contact("Ali",
                    "Gafar",
                    "BMI Services",
                    "HR Manager",
                    new ArrayList<Phone>(),
                    new ArrayList<Email>()
            ));

            contacts.get(2).getPhones().add(new Phone("412-116-9988",
                    "Work"));
            contacts.get(2).getEmails().add(new Email("ali@bmi.com","Work"));

            counter++;
            return true;
        }
        return false;

    }



}

import Models.Contact;

import java.util.List;

public class Services {



    public static Object[] printAllContacts(List<Contact> contacts){


        List<Contact> newContacts = contacts;
        newContacts.sort((o1, o2) -> {
            if(o1.getlName().compareTo(o2.getlName()) < 0){
                return -1;
            }else if(o1.getlName().compareTo(o2.getlName()) > 0){
                return 1;
            }
            return 0;
        });

        return newContacts.toArray();

    }
}


//https://github.com/AEIN2010/CS489_Quiz1.git
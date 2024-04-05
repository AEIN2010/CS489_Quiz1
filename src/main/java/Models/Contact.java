package Models;

import java.util.List;

public class Contact {


    private String fName;
    private String lName;
    private String company;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;


    public Contact(String fName, String lName, String company, String jobTitle, List<Phone> phones, List<Email> emails) {

        this.fName = fName;
        this.lName = lName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phones = phones;
        this.emails = emails;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }


    @Override
    public String toString() {
        String json =
                "\"Contact\":{\n"
                +"\t\"fName\":"+fName
                        +"\n\t\"lName\":"+lName
                        +"\n\t\"company\":"+company
                        +"\n\t\"job\":"+jobTitle;
        for(Phone p:phones){
            json = json+p;
        }

        for(Email e:emails){
            json = json+e;
        }

        json += "}\n";

        return json;

    }


}

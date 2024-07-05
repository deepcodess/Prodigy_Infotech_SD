import java.util.*;
class Contact{
    public String name;
    public String phonenumber;
    public String email;

    public Contact(String name, String phonenumber, String email){
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Email Address: " + email);
    }
}
public class PRODIGY_SD_03 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contact> contacts= new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("Contact Management System");
            System.out.println("Press 1. Add new contact");
            System.out.println("Press 2. View Contact");
            System.out.println("Press 3. Modify Contact");
            System.out.println("Press 4. Delete Contact");
            System.out.println("Press 5. Exit");

            System.out.println("Enter the choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                addcontact();
                break;

                case 2:
                viewcontact();
                break;

                case 3:
                //modifycontact();
                break;

                case 4:
                //deletecontact();
                break;

                case 5:
                System.out.println("Exiting...");
                break;

                default:
                System.out.println("Invalid Choice.");
            }

            
        }while(choice != 5);
        sc.close();
    }

    public static void addcontact()
    {
        System.out.print("Name: ");
        String Name = sc.nextLine();
        System.out.print("Phone Number: ");
        String phoneno = sc.next();
        System.out.print("Email address: ");
        String emailaddress = sc.next();

        Contact newContact = new Contact(Name, phoneno, emailaddress);
        contacts.add(newContact);
        System.out.println("Contact Added.");
    }

    public static void viewcontact()
    {
        System.out.println("Contact Numbers: ");
        for(Contact i : contacts){
            if(contacts.isEmpty())
            {
                System.out.println("No Contacts");
            }
            else{
                i.displayContact();
            }
        }
    }

    public static void modifycontact()
    {
        if(contacts.isEmpty())
        {
            System.out.println("No Contact");
        }
        else{
            viewcontact();
            System.out.println("Enter the index of the contact: ");
            int index = sc.nextInt();

            if(index >= 0 && index<contacts.size())
            {
                System.out.println("Previous Contact: ");
                contacts.get(index).displayContact();

                System.out.println("Enter New Name: ");
                String newname = sc.next();

                System.out.println("Enter New Phone number: ");
                String newphoneno = sc.next();

                System.out.println("Enter new Email Address: ");
                String newemail = sc.next();

                Contact modifiedcontact = new Contact(newname, newphoneno, newemail);
                contacts.set(index, modifiedcontact);
                System.out.println("Contact updated successfully");
            }
            else{
                System.out.println("Invalid Index.");
            }
        }
    }

    public static void deletecontact()
    {
        if(contacts.isEmpty())
        {
            System.out.println("No Contacts.");
        }
        else{
            viewcontact();
            System.out.print("Enter the index of the contact to be deleted: ");
            int index = sc.nextInt();

            if(index >= 0 && index <contacts.size())
            {
                System.out.println("Deleting Contact: ");
                contacts.get(index).displayContact();
                contacts.remove(index);
                System.out.println("Contact deleted.");
            }
            else{
                System.out.println("Invalid Index.");
            }
        }
    }
}

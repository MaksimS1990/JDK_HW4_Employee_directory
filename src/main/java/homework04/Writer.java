package homework04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer implements Writing {
    @Override
    public void writeToFile(ArrayList<Employees> contactsList) throws IOException {
        FileWriter writer = new FileWriter("phonebook.csv", false);
        for(Employees c  : contactsList) {
            writer.write(c.getId() + "," + c.getPhoneNumber() + "," + c.getFirstName() + "," + c.getExperience() + "\n");
        }
        writer.close();
    }
}

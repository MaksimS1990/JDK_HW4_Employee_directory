package homework04;

import java.io.IOException;
import java.util.ArrayList;

public interface Writing {
    void writeToFile(ArrayList<Employees> contactsList) throws IOException;
}
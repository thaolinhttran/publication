package publicationproject;

import java.util.*;

//This class creates a list of publications, sort them, and print using the other classes
public class PublicationProject {

    public static void main(String[] args) {
        
        ArrayList<Publication> pubs = new ArrayList<>();
        pubs.add(new Book("John Carreyrou", "Bad Blood: Secrets and Lies in a Silicon Valley Startup", "True crime", 1, 2018));
        pubs.add(new Book("Andriy Burkov", "The Hundred-Page Machine Learning Book",
            "Science", 1, 2019));

        pubs.add(new Magazine("Meredith Corporation", "Sports Illustrated", "Sports",
            633, 2020));
        pubs.add(new Magazine("Meredith Corporation", "People", "Entertainment", 466,
            2020));


        Collections.sort(pubs);

        for(Publication p : pubs)
            p.printInfo();

    }
    
}

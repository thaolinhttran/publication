package publicationproject;

//This class inherited the Publication class but override
//the printInfo class(polymorphism).
public class Magazine extends Publication {
    
    private String publisher;
    
    public Magazine(String publisherName, String pubTitle, String pubGenre, int ed, int pubYear){
        
        super(pubTitle, pubGenre, ed, pubYear);
        publisher = publisherName;
        
    }
    
    @Override
    public void printInfo(){
        
        System.out.printf("%s. Edition (%d) published in %d.\n%s magazine by %s.\n"
            , title, edition, year, genre, publisher);
        System.out.println(super.printFooter());
        
    }
    
}

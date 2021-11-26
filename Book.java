package publicationproject;

//This class inherited the Publication class but override
//the printInfo class(polymorphism).
public class Book extends Publication {
    
    private String author;
    
    public Book(String bookAuthor, String pubTitle, String pubGenre, int ed, int pubYear){
        
        super(pubTitle, pubGenre, ed, pubYear);
        author = bookAuthor;
        
    }
    
    @Override
    public void printInfo(){
        
        System.out.printf("%s. Edition (%d) published in %d.\n%s book by %s.\n"
                    , title, edition, year, genre, author);
        System.out.println(super.printFooter());
        
    }
}

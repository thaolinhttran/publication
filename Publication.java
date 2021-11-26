package publicationproject;


//This class is the parent's class of the Book and Magazine class. It contains
//all common attributes and behaviors that are in the other two classes.
public class Publication implements Comparable<Publication> {
    
    protected String title;
    protected String genre;
    protected int edition;
    protected int year;
    
    public Publication(String pubTitle, String pubGenre, int ed, int pubYear){
        
        title = pubTitle;
        genre = pubGenre;
        edition = ed;
        year = pubYear;
        
    }
    
    public void printInfo(){
        
        System.out.printf("%s. Edition (%d) published in %d\n", title, edition, year);
        
    }
    
    public String printFooter(){
        
        return String.format("All rights reserved!\n"
                + "--------------------");
          
    }
    
    @Override
    public int compareTo(Publication other){
        
        if(genre.compareTo(other.genre) != 0)
            return genre.compareTo(other.genre);
        else
            return title.compareTo(other.title);
        
    }
    
}

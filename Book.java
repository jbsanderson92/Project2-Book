/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private String isCourseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber="";
    }
    
    

    // Add the methods here ...
    public String getRefNumber(){
        return refNumber;
    }
    public int getBorrowed(){
        return borrowed;
    }
    public String courseText(){
        return isCourseText;
    }
    public void borrow(){
        borrowed=borrowed+1;
    }
    
        public void setRefNumber(String ref){
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else{
                System.out.println("Reference number needs to be more than 3 letters");
            }
    }
    
    
    
    public String printAuthor(){
        return author;
    }
    public String printTitle(){
        return title;
    }
    public int getPages(){
        return pages;
    }
    
    
    public void printDetails(){
    System.out.println("Author: " + author + "  Title: " + title + "  Pages: " + pages);
        
    if(refNumber.length()>0)
    {
        System.out.println("Reference number: " + refNumber);
    }
    else{
            System.out.println("Reference Number: ZZZ");
        }
        
        
    System.out.println(title + " has been borrowed " + borrowed + " times");
    }
    

}

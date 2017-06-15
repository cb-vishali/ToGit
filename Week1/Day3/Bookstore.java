
package bookstore;

/**
 *
 * @author cb-vishali
 */

public class BookStore {
    
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;
    
    BookStore(String name,Author[] authors,double price,int qtyInStock)
    {
        this.name=name;
        this.price=price;
        this.qtyInStock=qtyInStock;
        this.authors = new Author[authors.length];
        this.authors=authors;
    }
    BookStore(String name,Author authors,double price,int qtyInStock)
    {
        this.name=name;
        this.price=price;
        this.qtyInStock=qtyInStock;
        this.authors = new Author[1];
        this.authors[0]=authors;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQtyInStock(int qtyInStock)
    {
        this.qtyInStock=qtyInStock; 
    }
    public String getName()
    {
        return name;
    }
    public Author[] getAuthors()
    {
        return authors;
    }
    public double getPrice()
    {
        return price;
    }    
    public int getQtyInStock()
    {
        return qtyInStock; 
    }
    public void addAuthor(Author author)
    {
        if(authors==null)
        {
           authors=new Author[1];
           authors[0]=author;
        }
        else
        {
            
            Author[] tempAuthors=authors;
            authors=new Author[tempAuthors.length+1];
            for(int i=0;i<tempAuthors.length;i++)
            {
                authors[i]=tempAuthors[i];
            }
            authors[tempAuthors.length]=author;
        }
    }
    public void printAuthors()
    {
        for (Author author : authors) {
            System.out.println(author.toDisplay());
        }
    }
    public String toDisplay()
    {
        String details;
        details = name +" by ";
        for (Author author : authors) {
            details = details + author.toDisplay() + ", ";
        }
        details+="\nPrice : $"+price+"\nNo of books available : "+qtyInStock;
        return details;
    }
    public static void main(String[] args) {
        BookStore[] books=new BookStore[10];
        books[0]=new BookStore("Sindhbad",new Author("Sujatha","sujatha@gmail.com",'M'),500,174);
        books[0].addAuthor(new Author("Kalki","kalki@gmail.com",'M'));
        books[1]=new BookStore("Sherlock Holmes",new Author("Arthur Conan Doyle","arthur@gmail.com",'M'),400,800);
        for(BookStore book:books)
        {
            if(book!=null)
                System.out.println(book.toDisplay());
        }
        
    }
    
}






/********

output
------


debug:
Sindhbad by Sujatha(M) at sujatha@gmail.com, Kalki(M) at kalki@gmail.com, 
Price : $500.0
No of books available : 174
Sherlock Holmes by Arthur Conan Doyle(M) at arthur@gmail.com, 
Price : $400.0
No of books available : 800
BUILD SUCCESSFUL (total time: 0 seconds)

****/

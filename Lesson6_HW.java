import java.util.Scanner;

public class Book {
    public static final String GENRE_SCIENCE = "Техническая литература";
    public static final String GENRE_FICTION = "Художественная литература";
    
    private String strBookName = "";
    private String strAuthorName = "";
    private String strBookGenre = GENRE_FICTION;
    private int nYearOfPublication = 0;
    private int nPages = 0;
    
    public Book() {
        setBookName("");
        setAuthorName("");
        setGenre("");
        setYearOfPublication(0);
        setPages(0);
    }
    
    public void insertBookData() {
        Scanner in = new Sdcanner(System.in);
        System.out.print("Введите название книги - ");
        String strBook = in.nextLine();
        
        System.out.print("Введите имя автора - ");
        String strAuthor = in.nextLine();
        
        System.out.println("Выберите жанр:");
        String strGenre = "";
        do {
            System.out.println("1.Художественная литература\n2.Техническая литература");
            int nChoice = in.nextInt();
            if (nChoice == 1) {
                strGenre = GENRE_FICTION;
                break;
            } else if (nChoice == 2) {
                strGenre = GENRE_SCIENCE;
                break;
            }
                
        } while(true);
        
        System.out.print("Введите год публикации - ");
        int nYear = in.nextInt();
        
        System.out.print("Введите количество страниц - ");
        int nNumOfPages = in.nextInt();
        
        setBookName(strBook);
        setAuthorName(strAuthor);
        setGenre(strGenre);
        setYearOfPublication(nYear);
        setPages(nNumOfPages);
    }
    
    public void outBookData() {
        Syste.out.println("Название книги: " + getBookName() + "; имя автора: " + getAuthorName() +
        "; жанр: " + getGenre() + "; год публикации: " + getYearOfPublication() + "; количество страниц:" + getPages());
    }
    
    public String getBookName() {
        return strBookName;
    }
    
    public String getAuthorName() {
        return strAuthorName;
    }
    
    public String getGenre() {
        return strBookGenre;
    }
    
    public int getYearOfPublication() {
        return nYearOfPublication;
    }
    
    public int getPages() {
        return nPages;
    }
    
    public void setBookName(String strBookName) {
        this.strBookName = strBookName;
    }
    
    public void setAuthorName(String strAuthorName) {
        this.strAuthorName = strAuthorName;
    }
    
    public void setGenre(String strBookGenre) {
        this.strBookGenre = strBookGenre;
    }
    
    public void setYearOfPublication(int nYearOfPublication) {
        this.nYearOfPublication = nYearOfPublication;
    }
    
    public void setPages(int nPages) {
        this.nPages = nPages;
    }
}

package generics;
class Book
{
    int bookId;
    String bookName;
    int price;
    Book(int bookId,String bookName,int price)
    {
        this.bookId=bookId;
        this.bookName=bookName;
        this.price=price;
    }
        public String toString()
        {
            return  "Book Id : "+bookId+"\nBook Name :"+bookName +"\nPrice : "+price;
        }
        public boolean equals(Object o)
        {
            if(o instanceof Book)
            {
                Book book=(Book) o;
                if(book.price==this.price)
                {
                    return true;
                }
                else
                return false;
            }
            else
            {
                return false;
            }
        }
    }

public class Driver_q2 {
    public static void main(String[] args) {
        // creating object of the class Book
        Book b1 = new Book(101,"Java",50);
        Book b2=new Book(12, "C++",60);
        System.out.println("First Book Details:\n" +b1.toString());
        System.out.println(b1.equals(b2));
    }
}

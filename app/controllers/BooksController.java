package controllers;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.books.create;
import views.html.books.index;
import java.util.Set;
import javax.inject.Inject;

public class BooksController extends Controller{

    @Inject
    FormFactory formFactory;

    // for all books
    public Result index(){
        Set<Book> books = Book.allBooks();

        return ok(index.render(books));
    }

    // to create book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    // to save book
    public Result save(){

        return TODO;
    }

    // to edit book
    public Result edit(Integer id){
        return TODO;
    }

    // to update book
    public Result update(){
        return TODO;
    }

    // to delete book
    public Result destroy(Integer id){
        return TODO;
    }

    // for book details
    public Result show(Integer id){
        return TODO;
    }
}

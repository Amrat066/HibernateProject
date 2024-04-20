package hibernateWebApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateWebApp.Book;
 

public class InsertBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String price = request.getParameter("price");
 
        Book book = new Book();
        book.setAuthor(author);
        book.setIsbn(isbn);
        book.setName(name);
        book.setPrice(Integer.parseInt(price));
        book.setPublisher(publisher);
 
        SessionFactory session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session sess = session.openSession();
   
        Transaction tx = sess.beginTransaction();
        sess.save(book);
 
        sess.flush();
        tx.commit();
        session.close();
        response.sendRedirect("GetDataServlet");

    }
}
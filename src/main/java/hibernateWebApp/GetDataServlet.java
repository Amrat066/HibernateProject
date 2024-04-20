package hibernateWebApp;

import java.io.IOException;
import java.util.List;
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

public class GetDataServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
 
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = null;
       List<Book> books = null;
       try {
           transaction = session.beginTransaction();
           books = session.createQuery("FROM Book", Book.class).list();
           transaction.commit();
       } catch (Exception e) {
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       } finally {
           session.close();
       }
       request.setAttribute("books", books);
       request.getRequestDispatcher("bookDetails.jsp").forward(request, response);        
    }
}

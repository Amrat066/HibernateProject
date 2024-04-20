<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Manage Books</title>
  </head>
  <body>

     <h3> Insert Book </h3>
     <h4> Enter Books Details  </h4>
     <form action="InsertBookServlet" method="POST">
        <table >
           <tr> <td>ISBN </td> 
              <td> <input type="text" name="isbn" /> </td>
           </tr>
           <tr> <td>NAME </td> 
             <td> <input type="text" name="name" /> </td>
           </tr>
           <tr> <td>AUTHOR </td> 
              <td> <input type="text" name="author" /> </td>
           </tr>
           <tr> <td>PUBLISHER </td> 
              <td> <input type="text" name="publisher" /> </td>
           </tr>
           <tr> <td>PRICE </td> 
              <td> <input type="text" name="price" /> </td>
           </tr>
           <tr> <td><input type="Submit" value="Save"/> </td> 
           </tr>
        </table>
     </form>
   </body>
</html>
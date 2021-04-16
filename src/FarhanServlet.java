import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FarhanServlet")

public class FarhanServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        out.println("Servlet Called");
        out.println("Data Inserted Successfully");
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String fistname = request.getParameter("fistname");
        String lastname = request.getParameter("lastname");
        String daeofbirth = request.getParameter("daeofbirth");
        String emailaddress = request.getParameter("emailaddress");

        DbConnection dbConnection;
        dbConnection = new DbConnection();
        out.println("Data Inserted Sucessfully");
        //dbConnection.insertRecord(Username,Password,fistname,lastname,daeofbirth,emailaddress);

        response.sendRedirect("servletdisplay");

    }

}

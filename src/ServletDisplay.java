import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet(name = "ServletDisplay")
public class ServletDisplay extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body>");
        try
        {
            DbConnection dbConnection;
            dbConnection = new DbConnection();
            ResultSet rs = dbConnection.getRecords();;
            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr> <th>Username</th> </tr>");
            while (rs.next())
            {
                String user1 = rs.getString("Username");
                String user2 = rs.getString("Password");
                String user3 = rs.getString("firstname");
                String user4 = rs.getString("lastname");
                String user5 = rs.getString("daeofbirth");
                String user6 = rs.getString("emailaddress");
                //int id = rs.getInt("Id");
                out.println("<tr>" +
                        "<td>" + user1 + "</td><td>" + user2 +"</td>" +
                        "<td>" + user3 + "</td><td>" + user4 +"</td>" +
                        "<td>" + user5 + "</td><td>" + user6 +"</td>" +
                        "</tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        }
        catch (Exception e)
        {
            out.println("error");
        }
    }


}

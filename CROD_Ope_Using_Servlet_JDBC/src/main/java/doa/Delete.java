package doa;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("did"));
		
		try {

            Connection con=DataConnection.connect();
            System.out.println("Connection Successful!!!!");
            String query="DELETE FROM Books WHERE IDs = ?";
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
            con.close();
            out.println("row deleted in table");        

        }
        catch(Exception ex)
        {
        	System.out.println("Connection Error!!");
            ex.printStackTrace();
        }
        
		doGet(request, response);
	}

}

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

public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        int id = Integer.parseInt(request.getParameter("id"));
		String bookname = request.getParameter("bname");
		String category = request.getParameter("category");
		double price = Double.parseDouble(request.getParameter("price"));
		
		
		try {

            Connection con=DataConnection.connect();
            System.out.println("Connection Successful!!!!");
            String query="insert into Books values(?,?,?,?)";
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1,id);
            st.setString(2,bookname);
            st.setString(3, category);
            st.setDouble(4, price);
            st.executeUpdate();
            st.close();
            con.close();
            out.println("row updated in table");        

        }
        catch(Exception ex)
        {
        	System.out.println("Connection Error!!");
            ex.printStackTrace();
        }
        finally {
            System.out.println("inserted successfully...");
        }
		doGet(request, response);
	}
	

}

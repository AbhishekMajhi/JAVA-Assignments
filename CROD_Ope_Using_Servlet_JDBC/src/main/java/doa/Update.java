package doa;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		int ch = Integer.parseInt(request.getParameter("upcolumn"));
		String new_val = request.getParameter("newvalue");
		
		
		try {

            Connection con=DataConnection.connect();
            System.out.println("Connection Successful!!!!");
            PreparedStatement st = con.prepareStatement("select * from Books");
            switch(ch) {
            case 1:
            	String query="update Books set IDs=? where IDs=?";
            	st=con.prepareStatement(query);
                st.setInt(1,Integer.parseInt(new_val));
                st.setInt(2,uid);
                st.executeUpdate();
                break;
            case 2:
//            	String query=;
            	st=con.prepareStatement("update Books set name=? where IDs=?");
                st.setString(1, new_val);
                st.setInt(2,uid);
                st.executeUpdate();
                break;
            case 3:
//            	String query=;
            	st=con.prepareStatement("update Books set category=? where IDs=?");
                st.setString(1, new_val);
                st.setInt(2,uid);
                st.executeUpdate();
                break;
            case 4:
//            	String query=;
            	st=con.prepareStatement("update Books set price=? where IDs=?");
                st.setDouble(1, Double.parseDouble(new_val));
                st.setInt(2,uid);
                st.executeUpdate();
                break;
            default:
            	st.executeQuery();
            	out.print("You have entered a wrong choice!!");
            }
            
           
            st.close();
            con.close();
            out.println("row updated in table");        

        }
        catch(Exception ex)
        {
        	System.out.println("Connection Error!!");
            ex.printStackTrace();
        }
		doGet(request, response);
	}

}

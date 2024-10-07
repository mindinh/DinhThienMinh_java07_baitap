package buoi27;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="newsServlet", urlPatterns = {"/news"})
public class NewsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = JDBCConnection.getConnection();
		
		String query = "SELECT * FROM news";
		
		try {
			PreparedStatement prepStatement = conn.prepareStatement(query);
			
			ResultSet res = prepStatement.executeQuery();
			
			ArrayList newsList = new ArrayList<NewsEntity>();
			
			while (res.next()) {
				NewsEntity n = new NewsEntity();
				n.setNews_title(res.getString("title"));
				n.setNews_content(res.getString("content"));
				n.setImg_url(res.getString("image_url"));
				
				newsList.add(n);
				
			}
			
			System.out.println("test " + newsList.size());
			
			req.setAttribute("newsList", newsList);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		catch (Exception e) {
			System.out.println("Error query " + e.getMessage());
			
		}
		
	}
	
	
}

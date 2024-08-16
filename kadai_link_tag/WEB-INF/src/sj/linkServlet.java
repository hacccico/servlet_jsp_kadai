package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class linkServlet extends HttpServlet {
	//GETメソッドのリクエスト受信時に実行されるメソッド
		public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			String name = request.getParameter("name");

			// リンクをクリックした後であることを示す属性を設定して転送
			request.setAttribute("text", "Servletからデータを受信しました" + name + "さん、こんにちは！");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}

}

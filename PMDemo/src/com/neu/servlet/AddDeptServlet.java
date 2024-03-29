package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.DeptDao;
import com.neu.dao.DeptDaoImpl;
import com.neu.entity.Dept;

/**
 * Servlet implementation class AddDeptServlet
 */
@WebServlet("/AddDeptServlet")
public class AddDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String type = request.getParameter("type");
		int tel = Integer.parseInt(request.getParameter("tel"));
		String email = request.getParameter("email");
		
		DeptDao dao=new DeptDaoImpl();
		Dept dept =new Dept(deptno, dname, type, tel, email);
		try {
			
			int n = 0;
			if(!(dname == null || "".equals(dname) ||email == null || "".equals(email)|| 
					  type == null || "".equals(type) )
	) {
				n = dao.insert(dept);
				
			}
			request.setAttribute("n",n);
			request.getRequestDispatcher("/addDept.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
						
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.EmpDao;
import com.neu.dao.EmpDaoImpl;
import com.neu.entity.Emp;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Integer empno =Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String dname = request.getParameter("dname");
		String emply = request.getParameter("emply");
		String status = request.getParameter("status");
		
		EmpDao empDao = new EmpDaoImpl();
		
		Emp emp = new Emp(empno, ename, gender, dname, job, emply, status);
		
		
		try {
			 int n = 0;
			
			 if(!(dname == null || "".equals(dname) ||empno == null || "".equals(empno)||gender == null || "".equals(gender) 
			  ||job == null || "".equals(job) ||emply == null || "".equals(emply)
			  ||status == null || "".equals(status) ||ename == null || "".equals(ename))) {
				 n = empDao.insert(emp);
			 }
			 request.setAttribute("n", n);
			 request.getRequestDispatcher("/addEmp.jsp").forward(request, response); 
			
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

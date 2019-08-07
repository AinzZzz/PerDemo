package com.neu.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import com.neu.dao.EmpDao;
import com.neu.dao.EmpDaoImpl;
import com.neu.entity.Emp;

/**
 * Servlet implementation class UpEmpServlet
 */
@WebServlet("/UpEmpServlet")
public class UpEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Integer empno = Integer.parseInt(request.getParameter("empno"));
		String ename = request.getParameter("ename");
		String gender = request.getParameter("gender");
		String dname = request.getParameter("dname");
		String job = request.getParameter("job");
		String emply = request.getParameter("emply");
		String status = request.getParameter("status");
		Integer tel = Integer.parseInt(request.getParameter("tel"));
		String email = request.getParameter("email");
											
		try {	 
			
			EmpDao empDao = new EmpDaoImpl();
			
			Emp emp = new  Emp(empno,gender,dname,job,emply,status,tel,email,ename);
			int n = empDao.update(emp);
				if(n==1) {
				response.sendRedirect(request.getContextPath()+"/modifyEmp.jsp");
				}
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

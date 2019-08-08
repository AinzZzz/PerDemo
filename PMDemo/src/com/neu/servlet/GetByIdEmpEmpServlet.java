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
 * Servlet implementation class GetByIdEmpEmpServlet
 */
@WebServlet("/GetByIdEmpEmpServlet")
public class GetByIdEmpEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetByIdEmpEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empno =Integer.parseInt(request.getParameter("empno")) ;
		
		EmpDao empDao = new EmpDaoImpl();		
				
		try {
			Emp emp  =empDao.getById(empno);
			
			request.setAttribute("emp", emp);
			
			request.getRequestDispatcher("EmpId.jsp").forward(request, response);
			 
			

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

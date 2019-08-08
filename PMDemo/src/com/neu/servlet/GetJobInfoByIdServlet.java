package com.neu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.JobInfoDao;
import com.neu.dao.JobInfoDaoImpl;
import com.neu.entity.JobInfo;

/**
 * Servlet implementation class GetJobInfoByNameServlet
 */
@WebServlet("/GetJobInfoByIdServlet")
public class GetJobInfoByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetJobInfoByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer jobno =Integer.parseInt(request.getParameter("jobno")) ;
		
		JobInfoDao jobinfoDao = new JobInfoDaoImpl();
		
		
		
		try {
			JobInfo jobinfo  =jobinfoDao.getById(jobno);
			request.setAttribute("jobinfo", jobinfo);
			
			request.getRequestDispatcher("JobId.jsp").forward(request, response);
		
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

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
 * Servlet implementation class UpJobServlet
 */
@WebServlet("/UpJobServlet")
public class UpJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpJobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Integer jobno = Integer.parseInt(request.getParameter("jobno"));
		String job = request.getParameter("job");
		String jtype = request.getParameter("jtype");
		String weave = request.getParameter("weave");
		
		
		
		try {

			JobInfoDao jobinfoDao = new JobInfoDaoImpl();
			
			JobInfo jobinfo = new JobInfo(jobno,job,jtype,weave);			
						
			int n = jobinfoDao.update(jobinfo);
			if(n==1) {
				response.sendRedirect(request.getContextPath()+"/modifyJob.jsp");
				
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

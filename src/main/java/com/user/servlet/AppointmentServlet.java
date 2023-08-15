package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AppointmentDAO;
import com.db.DBConnect;
import com.entity.Appointment;
@WebServlet("/appAppointment")
public class AppointmentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 	int userId = Integer.parseInt(req.getParameter("userid"));
			String fullname = req.getParameter("fullname");
			String gender = req.getParameter("gender");
			String age = req.getParameter("age");
			String appoindate = req.getParameter("appoindate");
			String appointype = req.getParameter("appointype");
			String phno = req.getParameter("phno");
			String diseases = req.getParameter("diseases");
			int doctor_id = Integer.parseInt(req.getParameter("doctor"));
			String referralcenter = req.getParameter("referralcenter");
			String address = req.getParameter("address");
			
			Appointment ap=new Appointment(userId, fullname, gender, age, appoindate, appointype, phno, diseases, doctor_id, referralcenter, address, "pending");
			AppointmentDAO dao=new AppointmentDAO(DBConnect.getConn());
			HttpSession session=req.getSession();
			boolean f = dao.addAppointment(ap);
			
			if(f)
				
			
			{
				session.setAttribute("succMsg", "Appointment Sucessfully");
				resp.sendRedirect("user_appointment.jsp");
			}else {
				session.setAttribute("errorMsg", "Something Wrong on server");
				resp.sendRedirect("user_appointment.jsp");
			}
	}
	

	

}

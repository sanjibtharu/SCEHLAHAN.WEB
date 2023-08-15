<%@page import="com.entity.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.DoctorDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Appointment</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
	<div class="container-fulid backImg p-1">
		<p class="text-center fs-2 text-white"></p>
	</div>
	<div class="container p-3">
		<div class="row">

			<div class="col-md-6">
				<div class="card paint-card">
					<div class="card-body">
						<p class="text-center fs-3">User Appointment</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-4 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty succMsg}">
							<p class=" fs-4 text-center text-success">${succMsg}</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						<form class="row g-3" action="appAppointment" method="post">
						<input type="hidden" name="userid" value="${userObj.id }">

							<div class="col-md-6">
								<label class="form-label">Full Name</label> <input required
									name="fullname" type="text" class="form-control">
							</div>
							<div class="col-md-6">
								<label>Gender</label> <select class="form-control" name="gender"
									required>
									<option value="gender">--select--</option>
									<option value="male">Male</option>
									<option value="female">Female</option>
								</select>
							</div>
							<div class="col-md-6">

								<label class="form-label">Age</label> <input required
									type="number" class="form-control" name="age">
							</div>
							<div class="col-md-6">
								<label class="form-label">Appointment Date</label> <input
									type="date" class="form-control" required
									name="appoindate">
							</div>
							<div class="col-md-6">
								<label>Appointment Type</label> <select class="form-control"
									name="appointype" required>
									<option value="gender">--select--</option>
									<option value="eye">EYE</option>
									<option value="ear">EAR</option>
								</select>
							</div>
							<div class="col-md-6">
								<label class="form-label">Phone/Mobile No</label> <input
									maxlength="10" required type="number" class="form-control"
									name="phno">
							</div>
							<div class="col-md-6">
								<label class="form-label">Diseases</label> <input required
									type="text" class="form-control" name="diseases">
							</div>
							<div class="col-md-6">
								<label for="inputPassword4" class="form-label">Doctor</label> <select
									required class="form-control" name="doctor">
									<option value="">--select--</option>
									<option value="eye">Dr.sanjay</option>
									<%
									DoctorDao dao = new DoctorDao(DBConnect.getConn());
									List<Doctor> list = dao.getAllDoctor();
									for (Doctor d : list) {
									%>
									<option value="<%=d.getId()%>"><%=d.getFullName()%> (<%=d.getSpecialist()%>)
									</option>
									<%
									}
									%>
								</select>
							</div>
							<div class="col-md-6">
								<label>Referral Center</label> <select class="form-control"
									name="referralcenter" required>
									<option value="ECCCenter">--select--</option>
									<option value="MALANGWA">MALANGWA</option>
									<option value="SIRAHA">SIRAHA</option>
									<option value="JALESHWOR">JALESHWOR</option>
									<option value="RAJBIRAJ">RAJBIRAJ</option>
									<option value="GAIGHAT">GAIGHAT</option>
									<option value="LALBANDI">LALBANDI</option>
									<option value="DHANUSHADHAM">DHANUSHADHAM</option>
									<option value="KATARI">KATARI</option>
									<option value="MAHENDRANAGAR">MAHENDRANAGAR</option>
									<option value="KANCHNPUR">KANCHNPUR</option>
									<option value="MIRCHIYA">MIRCHIYA</option>
									<option value="HALESHI">HALESHI</option>
									<option value="KHALTE">KHALTE</option>
									<option value="KHOTANG">KHOTANG</option>
									<option value="BARDIBASH">BARDIBASH</option>
									<option value="BELTAR">BELTAR</option>
									<option value="SHUKHIPUR">SHUKHIPUR</option>
								</select>
							</div>
							<div class="col-md-12">
								<label>Full Address</label>
								<textarea required name="address" class="form-control" rows="3"
									cols=""> </textarea>
							</div>
							
							
							<c:if test="${not empty userObj }">
							<button class="col-md-6 offset-md-3 btn btn-success">Register</button>
							</c:if>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>	
</body>
</html>
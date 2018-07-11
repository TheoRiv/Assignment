
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- This is our login page -->
<title>Login</title>
</head>
<body>
	<form name="submitForm" method="POST">
		<div align="center">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
			<div>${error}</div>
			<!-- In case of wrong information, an error message is displayed -->
		</div>
	</form>
</body>
</html>
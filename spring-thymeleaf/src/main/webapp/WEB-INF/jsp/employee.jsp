<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Employee Attendance System</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>

	<h1>Employees System</h1>

	<h2>Employee List</h2>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Mark Attendance</th>
				<th>View Attendance</th>
			</tr>
		</thead>
		<tbody>
			<tr th:if="${employees.empty}">
				<td colspan="2">No Employee Available</td>
			</tr>
			<tr th:each="employee : ${employees}">
				<td><span th:text="${employee.id}"> ID </span></td>
				<td><span th:text="${employee.name}"> Name </span></td>
				<td><span th:text="${employee.department.name}"> Department </span></td>
				<td><a th:href="@{/attendance/mark{empId}(empId=${employee.id})}">Mark Attendance</a></td>
				<td><a th:href="@{/attendance/view/{empId}(empId=${employee.id})}">View Attendance</a></td>
			</tr>
		</tbody>
	</table>
</body>
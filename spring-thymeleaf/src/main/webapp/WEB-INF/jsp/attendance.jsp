<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Employee Attendance System</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<h1>Attendance Page</h1>
	<div>
		<span th:text="${employee.name}">Employee Name</span>
	</div>
	<table>
		<thead>
			<tr>
				<th>Date</th>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			<tr th:if="${attendances.empty}">
				<td colspan="2">No Attendance Available</td>
			</tr>
			<tr th:each="attendance : ${attendances}">
				<td><span th:text="${attendance.date}"> date </span></td>
				<td><span th:text="${department.employee.name}"> Name </span></td>
			</tr>
		</tbody>
	</table>
</body>
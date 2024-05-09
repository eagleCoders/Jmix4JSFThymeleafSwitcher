<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Employee Attendance System</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>

	<h1>Department System</h1>

	<h2>Departments List</h2>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			<tr th:if="${departments.empty}">
				<td colspan="2">No Department Available</td>
			</tr>
			<tr th:each="department : ${departments}">
				<td><span th:text="${department.id}"> ID </span></td>
				<td><span th:text="${department.name}"> Name </span></td>
			</tr>
		</tbody>
	</table>
</body>
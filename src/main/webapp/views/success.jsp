<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Registration Success</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0f8ff;
            text-align: center;
            padding-top: 60px;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            display: inline-block;
            padding: 40px;
        }
        h1 {
            color: #2e8b57;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            color: #333333;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #ffffff;
            background-color: #2e8b57;
            padding: 10px 20px;
            border-radius: 4px;
        }
        a:hover {
            background-color: #246b45;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Registration Successful!</h1>
        <p>Thank you for submitting the student details.</p>

        <c:if test="${not empty studentName}">
            <p><strong>${studentName}</strong> has been registered successfully.</p>
        </c:if>

        <a href="/student">Register Another Student</a>
    </div>
</body>
</html>

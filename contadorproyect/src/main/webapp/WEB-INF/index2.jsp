<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <p>You have visited <a href="">http://your_server</a></p>
    <p>${count != null ? count : 0} times</p>
    <a href="${pageContext.request.contextPath}/test-another-visit">Test another visit</a>
</body>
</html>






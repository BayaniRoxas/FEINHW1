<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Researchers List</h2>
<ul>
    <c:forEach var="researcher" items="${researchers}">
        <li>
            Name: ${researcher.name}, Group: ${researcher.group},
            Area: ${researcher.area}, Grade: ${researcher.grade}
        </li>
    </c:forEach>
</ul>
<a href="/newResearcher?university=${universityId}">Add New Researcher</a>
</body>
</html>

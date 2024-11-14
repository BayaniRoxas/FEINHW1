<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<body>
<h2>List of Universities</h2>
<ul>
    <c:forEach var="university" items="${universities}">
        <li>
            Chancellor: ${university.chancellor},
            Campus: ${university.campus}
            <a href="/researchers?university=${university.id}">View Researchers</a>
        </li>

    </c:forEach>

    <a href="/universities/newUniversity">new university</a>
</ul>
</body>
</html>

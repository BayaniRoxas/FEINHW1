<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Add New University</h2>
<form:form action="/addUniversity" method="post" modelAttribute="university">

    <form:label path="id">ID:</form:label>
    <form:input path="id" type="number"/>
    <form:errors path="id"/>


    <br><br>
    <form:label path="chancellor">Chancellor:</form:label>
    <form:input path="chancellor" type="text"/>
    <form:errors path="chancellor"/>

    <br><br>
    <form:label path="campus">Campus:</form:label>
    <form:input path="campus" type="text"/>
    <form:errors path="campus"/>

    <br><br>
    <button type="submit">Add University</button>
</form:form>
</body>
</html>

<!-- src/main/webapp/WEB-INF/views/universities/form.jsp -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Add New Researcher</h2>
<form:form action="/researchers/addResearcher?university=${universityId}"  modelAttribute="researcher">


    <form:label path="name">name:</form:label>
    <form:input path="name" type="text"/>
    <form:errors path="name"/>

    <br><br>
    <form:label path="group">group</form:label>
    <form:input path="group" type="text"/>
    <form:errors path="group"/>

    <br><br>
    <form:label path="area">area:</form:label>
    <form:input path="area" type="text"/>
    <form:errors path="area"/>

    <br><br>
    <form:label path="grade">grade:</form:label>
    <form:input path="grade" type="number"/>
    <form:errors path="grade"/>

    <br><br>
    <button type="submit">Add Researcher</button>
</form:form>
</body>
</html>




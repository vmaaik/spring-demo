<%--
  Created by IntelliJ IDEA.
  User: Michal.Gebarowski
  Date: 13/08/2018
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<head>
    <title>Registration Page</title>
</head>
<body>


<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName"/>
Last name: <form:input path="lastName"/>

<input type="submit" value="Submit"/>

</form:form>

</body>
</html>


<%--When we load the form spring will call the get methods--%>
<%--When we submit the form spring will call the set methods--%>
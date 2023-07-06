<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<% 
String viewName = (String)request.getAttribute("viewName"); 
%>
<body>
    <div>Main, <%= viewName %></div>
    <hr />
    <div>Spring Security Area</div>
    <hr />
    <div>authorizeRequests() in SecurityConfiguration.java</div>
    <div>
        <a href="/admin">admin.jsp</a>
    </div>
    <div>
        <a href="/admin/read">/admin/*.jsp with Role</a>
    </div>
    <div>
        <a href="/manager/read">/manager/*.jsp with Role</a>
    </div>

</body>

</html>
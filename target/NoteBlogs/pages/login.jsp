<%--
  Created by IntelliJ IDEA.
  User: TianyuanPan
  Date: 3/22/16
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<div style="margin-left: 300px;margin-top: 100px">
  <form method="post" action="/Access/userlogin">
    ${userNumber}<input type="text" id="userNumber" name="userNumber"><br/><br/>
    ${password}<input type="password" id="password" name="password"><br/><br/>
    <input type="submit" value="${login}">

  </form>

</div>

<div style="margin-left: 300px;margin-top: 100px">
  <form action="/Access/findword">

    【字母】 word: <input type="text" id="word" name="word"><br/><br/>
    <input type="submit" value="Search GO">


  </form>

</div>

</body>
</html>

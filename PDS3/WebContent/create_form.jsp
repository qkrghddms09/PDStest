<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body leftmargin="0" topmargin="0">
  <!--  -->
  <%-- <jsp.include page="/menu/header.html" flush="false"/> --%>
  <!--  -->
  <section>
    <div class='content'>
      <FORM action="./create_proc.jsp" name="frm" method="post">
        <fieldset>
          <ul>
            <li><label for="title">제목:</label> <input type="text"
              name="title" id="title" size="50" value="팔공산" /></li>
            <li><label for="url">URL:</label> <input type="text"
              name="url" id="url" size="50" value="http://www.naver.com" /></li>
            <li><label for="file1">참고 파일:</label> <input
              type="text" name="file1" id="file1" size="50"></li>
            <li><label for="rname">이름:</label> <input type="text"
              name="" rname"" id="" rname"" size="50" value="홍길동" /> <label
              for="email">이메일:</label> <input type="email" name="email"
              id="email" size="50" value="mail@naver.com" /> <label
              for="passwd">패스워드:</label> <input type="password"
              name="passwd" id="passwd" size="50" /></li>

            <li>
              <button type="submit">등록</button>
              <button type="button" onClick="location.href='./list.jsp'">목록</button>
            </li>
          </ul>
        </fieldset>
      </FORM>
    </div>
  </section>
  <!--  -->
  <%-- <jsp.include page="/menu/footer.html" flush="false"/> --%>
  <!--  -->
</body>
</html>
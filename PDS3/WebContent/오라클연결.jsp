<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="java.sql.*" %> <!-- 임포트문 -->

<!DOCTYPE html>
<%
  String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
  // oracle과 jar를 연결하기 위하 드라이버다.
  String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
  //XE 데이터 베이스 이름  디폴트로 잡혀 있다.
  // 내 컴퓨터는 127.0.0.1 oracle의 포트넘버는 1521
  
  String USERNAME = "scott";
  String PASSWORD = "tiger";
  // 패스워드와 비밀번호 입력
  
  Connection conn = null;
  Statement stmt = null;
    // import 자바.에스큐엘.* 하면 모두 임포트
  
    // select table_name from tabs; 오라클에서 테이블 보기
    // desc sample;         테이블 구조 보기
    //
    Boolean connect = false;
    try {
      Class.forName(JDBC_DRIVER);      // 외부에서 연결
      conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
      // 연결 객체로 연결 시켜라...
      connect = true;
      conn.close();
     }catch(Exception ex) {
          ex.printStackTrace();
     }
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>오라클 JDBC 연동</h3>
  <%  if (connect == true){  %>
  <!-- //출력문 -->
  <h4> 오라클 DB 연결 성공 </h4>
  <% }else{  %>
  <!-- //출력문 -->
  <h4> 오라클 DB 연결 실패 </h4>
  <%} %>
</body>
</html>
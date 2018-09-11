<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 파일 업로드를 가능하게 하는 파일을 다운로드 받아야 한다. -->
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="pds3.Tool.*" %>
<%@ page import="pds3.*" %>
<%
  request.setCharacterEncoding("utf-8");
%>
<%
  PdsDAO pdsDAO = new PdsDAO();
%>
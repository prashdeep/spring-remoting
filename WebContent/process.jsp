<jsp:include page="index.jsp"></jsp:include>  
<hr/>  
<%@page import="com.remoting.http.ClientInvoker"%>  
  
<%  
int a=Integer.parseInt(request.getParameter("first"));  
int b=Integer.parseInt(request.getParameter("second"));  
out.print("cube of "+ClientInvoker.sum(a, b));  
%>
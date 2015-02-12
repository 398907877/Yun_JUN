<%@tag pageEncoding="UTF-8"%>
<%@ attribute name="page" type="org.springframework.data.domain.Page" required="true"%>
<%@ attribute name="paginationSize" type="java.lang.Integer" required="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
int current =  page.getNumber() + 1;
int begin = Math.max(1, current - paginationSize/2);
int end = Math.min(begin + (paginationSize - 1), page.getTotalPages());

request.setAttribute("current", current);
request.setAttribute("begin", begin);
request.setAttribute("end", end);
%>

<div  style="margin-left: 500px"  class="pagination">
	
		 <% if (page.hasPreviousPage()){%>
               	<a href="?page=1&sortType=${sortType}&${searchParams}">&lt;&lt;</a>
                <a href="?page=${current-1}&sortType=${sortType}&${searchParams}">&lt;</a>
         <%}else{%>
                <a href="#">&lt;&lt;</a>
               <a href="#">&lt;</a>
         <%} %>
 
		<c:forEach var="i" begin="${begin}" end="${end}">
            <c:choose>
                <c:when test="${i == current}">
                    <a href="?page=${i}&sortType=${sortType}&${searchParams}">${i}</a>
                </c:when>
                <c:otherwise>
                    <a href="?page=${i}&sortType=${sortType}&${searchParams}">${i}</a>
                </c:otherwise>
            </c:choose>
        </c:forEach>
	  
	  	 <% if (page.hasNextPage()){%>
             <a href="?page=${current+1}&sortType=${sortType}&${searchParams}">&gt;</a>
              <a href="?page=${page.totalPages}&sortType=${sortType}&${searchParams}">&gt;&gt;</a>
         <%}else{%>
                <a href="#">&gt;</a>
                <a href="#">&gt;&gt;</a>
         <%} %>


</div>


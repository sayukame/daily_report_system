<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${errors != null}">
 <div id="flush_error">
      入力内容にエラーがあります。<br />
      <c:forEach var="error" items="${errors}">
              ・<c:out value="${error}" /><br />
      </c:forEach>
 </div>
</c:if>
<label for="report_date">日付</label><br />
<input type="date" name="report_date" value="<fmt:formatDate value='${report.report_date}' pattern='yyyy-MM-dd' />" />
<br /><br />

<label for="title">タイトル</label><br />
<input type="text" name="title" value="${report.title}" />
<br /><br />

<label for="content">内容</label><br />
<textarea name="content" rows="10" cols="50">${report.content}</textarea>
<br /><br />

<label for="work_time">出勤時間</label>
<input type="number" name="work_time" value="${report.work_time}"/>
<label for="work_minute">出勤分</label>
<input type="number" name="work_minute" value="${report.work_minute}" />
<br /><br />

<label for="leave_time">退勤時間</label>
<input type="number" name="leave_time" value="${report.leave_time}"/>
<label for="leave_minute">退勤分</label>
<input type="number" name="leave_minute" value="${report.leave_minute}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">投稿</button>





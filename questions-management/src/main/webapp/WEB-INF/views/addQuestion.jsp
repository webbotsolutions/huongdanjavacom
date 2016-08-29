<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form action="<c:url value='doAddQuestion' />" method="post">
	<div class="form-group">
		<label>Category</label> 
		<select class="form-control" name="category">
			<c:forEach items="${categories}" var="map">
				<c:forEach items="${map}" var="c">
					<option value="${c.key}">${c.value}</option>
				</c:forEach>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label>Description</label>
		<textarea rows="3" class="form-control" name="description"></textarea>
	</div>
	<input type="submit" value="Add" class="btn btn-default">
</form>
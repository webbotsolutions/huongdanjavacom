<%@page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a class="btn btn-success" href="<c:url value='addQuestion' />">Add question</a>
<table class="table table-striped">
	<thead>
		<tr>
			<th>N0</th>
			<th>Content</th>
			<th>Options</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>Question</td>
			<td>4</td>
			<td>
				<a class="btn btn-primary btn-xs" href="<c:url value='addQuestion' />">Edit</a>
				<a class="btn btn-danger btn-xs" href="<c:url value='addQuestion' />">Delete</a>
			</td>
		</tr>
	</tbody>
</table>
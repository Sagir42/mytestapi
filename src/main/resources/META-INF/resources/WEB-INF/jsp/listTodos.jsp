<%@ include file="common/header.jspf" %>
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
			 <h1>Your Todos are </h1>
			 <table class="table">
			 	<thead>
			 		<tr>
			 			<th>Description</th>
			 			<th>Target Date</th>
			 			<th>Is Completed?</th>
			 			<th></th>
			 			<th></th>
			 		</tr>
			 	</thead>
			 	<tbody>
			 		<c:forEach items="${todos}" var="todo">
			 		
			 		<tr>
			 			<td>${todo.description}</td>
			 			<td>${todo.targetDate}</td>
			 			<td>${todo.complete}</td>
			 			<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
			 			<td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
			 		</tr>
			 			
			 		</c:forEach>
			 	</tbody>
			 </table>
			 <a href="add-todo" class="btn btn-success">Add Todo</a>
		 </div>
<%@ include file="common/footer.jspf" %>
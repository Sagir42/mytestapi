package com.learning.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
//	private static List<Todo> todos = new ArrayList<Todo>();
//	private static int todoCounter = 0;
	
//	static {
//		todos.add(new Todo(++todoCounter, "Learning_Hub", "Learning AWS", LocalDate.now().plusYears(1), false));
//		todos.add(new Todo(++todoCounter, "Learning_Hub", "Learning DevOps", LocalDate.now().plusYears(2), false));
//		todos.add(new Todo(++todoCounter, "Learning_Hub", "Learning Full stack", LocalDate.now().plusYears(3), false));
//	}
	
	/**
	 * Finding Todo by userName
	 * @param userName
	 * @return
	 */
//	public List<Todo> findByUsername(String userName){
//		
//		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(userName);
//		
//		return todos.stream().filter(predicate).toList();
//	}
	
	/**
	 * Finding Todo by its Id
	 * @param id
	 * @return Todo
	 */
//	public Todo findById(int id) {
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		Todo todo = todos.stream().filter(predicate).findFirst().get();
//		return todo;
//	}
	
	/**
	 * For adding new Todo
	 * @param name
	 * @param description
	 * @param targetDate
	 * @param done
	 */
//	public void addTodo(String name, String description, LocalDate targetDate, boolean done) {
//		todos.add(new Todo(++todoCounter, name, description, targetDate, done));
//	}
	
	/**
	 * Deleting Todo by its Id
	 * @param id
	 */
//	public void deleteById(int id) {
//		
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		todos.removeIf(predicate);
//	}
	
//	public void updateTodo(@Valid Todo todo) {
//		Todo previous = findById(todo.getId());
//		
//		previous.setDescription(todo.getDescription());
//		previous.setTargetDate(todo.getTargetDate());
//		previous.setUserName(todo.getUserName());
//		previous.setComplete(todo.isComplete());
//	}
	
}

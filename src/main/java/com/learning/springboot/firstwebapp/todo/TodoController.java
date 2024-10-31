package com.learning.springboot.firstwebapp.todo;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import jakarta.validation.Valid;
//
////@Controller
//@SessionAttributes("name")
public class TodoController {
//	
//	private TodoService todoService;
//	
//	public TodoController(TodoService todoService) {
//		super();
//		this.todoService = todoService;
//	}
//	
//
//	@RequestMapping("/list-todos")
//	public String listAllTodos(ModelMap model) {
//		String userName = getLoggedinUsername();
//		model.put("name", userName);
//		List<Todo> todos = todoService.findByUsername(userName);
//		model.addAttribute("todos", todos);
//		
//		return "listTodos";
//	}
//	
//	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
//	public String addTodoPage(ModelMap model) {
//		String userName = getLoggedinUsername();
//		Todo todo = new Todo(0, userName, "", LocalDate.now().plusMonths(6), false);
//		model.put("todo", todo);
////		todoService.addTodo( model.get("name"), null, null, false)
//		
//		return "addTodo";
//	}
//	
//	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
//	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
//		
//
//		
//		String name = getLoggedinUsername();
//		String desc = todo.getDescription().trim();
//		if(desc.length()<1) {
//			model.put("todoError","Enter Valid Input");
//			return "addTodo";
//		}
//		
//		if(result.hasErrors()) {
//			return "addTodo";
//		}
//		todoService.addTodo(name, desc, todo.getTargetDate(), false);
//		return "redirect:list-todos";
//	}
//	
//	@RequestMapping(value="/delete-todo")
//	public String deleteTodo(@RequestParam int id, ModelMap model) {
//		
//		todoService.deleteById(id);
//
//		return "redirect:list-todos";
//	}
//	
//	@RequestMapping(value="/update-todo", method=RequestMethod.GET)
//	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
//		Todo todo = todoService.findById(id);
//		model.put("todo", todo);
//
//		return "addTodo";
//	}
//	
//	@RequestMapping(value="/update-todo", method=RequestMethod.POST)
//	public String updateTodo(@RequestParam int id, ModelMap model, @Valid Todo todo, BindingResult result) {
//		
//		if(result.hasErrors()) {
//			return "addTodo";
//		}
//		
//		String name = getLoggedinUsername();
//		String desc = todo.getDescription().trim();
//		if(desc.length()<1) {
//			model.put("todoError","Enter Valid Input");
//			return "addTodo";
//		}
//		todo.setUserName(name);
//		todoService.updateTodo(todo);
//		return "redirect:list-todos";
//	}
//	
//	private String getLoggedinUsername() {	
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		String userName = authentication.getName();
//		return userName;
//	}
//	
}

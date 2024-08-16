package org.zero.w1.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zero.w1.todo.dto.TodoDTO;
import org.zero.w1.todo.dto.Todo.dao.TodoDao;

public class TodoService {
	public int register(TodoDTO todoDTO) {
		// DB에 insert
		
		TodoDao todoDAO = new TodoDao();
		return todoDAO.insert(todoDTO);
	}

	public List<TodoDTO> getList(){
		// DB에서 select
		
		
		TodoDao todoDAO = new TodoDao();
		
		List<TodoDTO> list = todoDAO.selectAll();
		
//		List<TodoDTO> list = new ArrayList<TodoDTO>();
//		
//		for(int i=0; i<10; i++) {
//			TodoDTO dto = new TodoDTO();
//			dto.setTno(i);
//			dto.setTitle("todo..."+i);
//			dto.setDueDate(LocalDate.now());
//			
//			list.add(dto);
//		}
		
		return list;
		
	}
	
	public TodoDTO get(int tno1) {
		
		TodoDao dao = new TodoDao();
		
		TodoDTO dto1 = new TodoDTO();
		dto1 = dao.selectOne(tno1);
		
//		dto1.setTno(tno1);
//		dto1.setTitle(tno1+"번째 글");
//		dto1.setDueDate(LocalDate.now());
//		dto1.setFinished(true);
		
		return dto1;
	}
	
	public int remove(int tno) {
		TodoDao dao = new TodoDao();
		return dao.deleteOne(tno);
	}
	
	public int modify(TodoDTO todoDTO) {
		// DB에 insert
		
		TodoDao todoDAO = new TodoDao();
		return todoDAO.updateOne(todoDTO);
	}
}
	
package org.zero.w1.todo.dto;

import java.time.LocalDate;

public class TodoDTO {

	private int tno;  			// tno는 고유번호 (number)
	private String title;			// title은 할일
	private LocalDate dueDate; // dueDate 는 할 시간 
	private boolean finished;   // finished는 했는지 여부
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDueDate() {
		return dueDate;
	} 
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", title=" + title + ", dueDate="
				+ dueDate + ", finished=" + finished + "]";
	}
	public Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

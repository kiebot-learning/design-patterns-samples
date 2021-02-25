package com.sps.designpatterns;

import java.util.Arrays;
import java.util.List;


public class MainApplication {

	public static void main(String[] args) { 
		
		Editor editor = new Editor();
		History history = new History();

		editor.setContent("test1");
		history.push(editor.createState());

		editor.setContent("test2");
		history.push(editor.createState());

		editor.setContent("test3");
		history.push(editor.createState());

		editor.setContent("test4");

		editor.restore(history.pop());
		editor.restore(history.pop());
		editor.restore(history.pop());

		System.out.println(editor.getContent());
	}
}
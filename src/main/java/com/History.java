package com.sps.designpatterns;

import java.util.*;

public class History {
    
    private Stack<EditorState> stack;
    
    public History() {
        stack = new Stack<>();
    }

    public void push(EditorState state) {
        stack.push(state);
    }

     public EditorState pop() {
        EditorState state = stack.pop();
        return state;
    }

}

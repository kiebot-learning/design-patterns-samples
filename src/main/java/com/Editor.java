package com.sps.designpatterns;

public class Editor {
    private String content;
    
    public EditorState createState() {
        return new EditorState(this.content);
    }

    public Editor() {
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restore(EditorState prevState){
        if(prevState!= null)
            setContent(prevState.getContent());
    }

}

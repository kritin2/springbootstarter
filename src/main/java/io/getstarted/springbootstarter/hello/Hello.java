package io.getstarted.springbootstarter.hello;

public class Hello {

    private int id;
    private String content;

    public Hello() {
        this.id = 0;
        this.content = "";
    }

    public Hello(int id, String content) {
        this.id = id;
        this.content = content;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

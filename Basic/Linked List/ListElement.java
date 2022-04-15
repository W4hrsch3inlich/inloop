public class ListElement {
    private String content;
    private ListElement next;
    
    public ListElement(String content) {
        if(content == null || content == "") throw new IllegalArgumentException("List Element cannot be empty.")
        this.content = content;
        this.next = null;
    }
    
    public String getContent() {
        return content;
    }
    
    public ListElement getNext() {
        return next;
    }
    
    public void setContent(String content) {
        if(content == null || content == "") throw new IllegalArgumentException("List Element cannot be empty.")
        this.content = content;
    }
    
    public void setNext(ListElement next) {
        this.next = next;
    }
}
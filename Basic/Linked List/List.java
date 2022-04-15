public class List {
    private ListElement head;
    
    public void append(String content) {
        if(content == null || content == "") throw new IllegalArgumentException("List Element cannot be empty.")
        if(head == null) head = new ListElement(content);
        else { 
            ListElement runner = head;
            while(runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(new ListElement(content));
        }
    }
    
    public String remove(String content) {
        if(content == null || content == "") throw new IllegalArgumentException("List Element cannot be empty.")
        if(head == null) return null;
        if(head.getContent() == content) {
            head = null;
            return content;
        }
        if(head.getNext() == null) return null;
        ListElement runner = head;
        while(runner.getNext().getContent() != content) {
            runner = runner.getNext();
            if(runner.getNext() == null) return null; 
        } 
        runner.setNext(runner.getNext().getNext());
        return content;
    }
}
package model;

//TODO 01: Umsetzung der Klasse Stack gemäß der Dokumentations des Landes.
public class Stack<ContentType> {

    private class Node {
        private Node before;
        private ContentType content;

        public Node(ContentType pContent) {
            content = pContent;
            before = null;
        }

        public ContentType getContent() {
            return content;
        }

        public void setBefore(Node before) {
            this.before = before;
        }

        public Node getBefore() {
            return before;
        }
    }

    private Node top;

    public Stack(){
        top = null;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    public void push(ContentType pContent){
        if(pContent != null){
            Node newNode = new Node(pContent);
            //Falls der Stapel leer ist.
            if(this.isEmpty()){
                top = newNode;
            }else{
                newNode.setBefore(top);
                top = newNode;
            }
        }
    }

    public void pop(){
        if(!isEmpty()){
            top = top.getBefore();
        }
    }

    public ContentType top(){
        if(!isEmpty()) {
            return top.getContent();
        }
        return null;
    }

}

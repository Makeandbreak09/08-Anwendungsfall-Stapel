package model;

//TODO 01: Umsetzung der Klasse Stack gemäß der Dokumentations des Landes.
public class Stack<ContentType> {

    private class Node {
        private Node next;
        private ContentType content;

        public Node(ContentType pContent) {
            content = pContent;
            next = null;
        }

        public ContentType getContent() {
            return content;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
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
                newNode.setNext(top);
                top = newNode;
            }
        }
    }

    public void pop(){
        if(!isEmpty()){
            top = top.getNext();
        }
    }

    public ContentType top(){
        if(!isEmpty()) {
            return top.getContent();
        }
        return null;
    }

}

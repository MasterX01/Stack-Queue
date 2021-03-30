package com.bridgelabz.stackandqueue;

public class MyStackAndQueue {
     MyLinkedList myLinkedList;

    public MyStackAndQueue(){
        this.myLinkedList=new MyLinkedList();
    }

    public void push(INode myNode){
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printNodes();
    }

    public INode peak() { return myLinkedList.head; }

    public INode pop(){ return myLinkedList.pop(); }

}

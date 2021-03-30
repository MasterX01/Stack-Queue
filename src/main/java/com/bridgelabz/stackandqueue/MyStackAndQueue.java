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

}

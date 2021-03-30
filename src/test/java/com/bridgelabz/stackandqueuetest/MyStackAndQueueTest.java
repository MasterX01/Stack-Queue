package com.bridgelabz.stackandqueuetest;

import com.bridgelabz.stackandqueue.MyNode;
import com.bridgelabz.stackandqueue.MyStackAndQueue;
import org.junit.jupiter.api.Test;

public class MyStackAndQueueTest {

    @Test
    public void given3NumberswhenAddedtoStackshouldhavelastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStackAndQueue myStack = new MyStackAndQueue();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        myStack.printStack();
    }
}

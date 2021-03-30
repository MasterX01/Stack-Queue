package com.bridgelabz.stackandqueuetest;

import com.bridgelabz.stackandqueue.INode;
import com.bridgelabz.stackandqueue.MyNode;
import com.bridgelabz.stackandqueue.MyStackAndQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackAndQueueTest {

    @Test
    public void given3Numbers_whenAddedtoStack_ShouldHaveLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStackAndQueue myStack = new MyStackAndQueue();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        myStack.printStack();
    }

    @Test
    public void given3NumbersinStack_whenPopped_ShouldMatchWithLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStackAndQueue myStack = new MyStackAndQueue();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();

        myStack.printStack();
        Assertions.assertEquals(myThirdNode,pop);
    }

    @Test
    public void given3Numbers_whenAddedtoQueue_ShouldHaveAppendedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyStackAndQueue myQueue = new MyStackAndQueue();

        myQueue.enqueu(myFirstNode);
        myQueue.enqueu(mySecondNode);
        myQueue.enqueu(myThirdNode);

        myQueue.printStack();
    }
}

package org.vinh.tdd.eulerTour;
public record Node<T> (Node<T> left, Node<T> right, T value){
}

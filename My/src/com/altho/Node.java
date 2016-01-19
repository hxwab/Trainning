package com.altho;

public class Node {
	private int value;
	private Node lNode;
	private Node rNode;
	private Node p;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getlNode() {
		return lNode;
	}
	public void setlNode(Node lNode) {
		this.lNode = lNode;
	}
	public Node getrNode() {
		return rNode;
	}
	public void setrNode(Node rNode) {
		this.rNode = rNode;
	}
	public Node getP() {
		return p;
	}
	public void setP(Node p) {
		this.p = p;
	}
	

}

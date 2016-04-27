package com.javasource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 
 * Collection
├List
│├LinkedList  (底层是双链表实现)
│├ArrayList （底层为对象数组，容量默认为10，扩容1.5，即每次增长原来的0.5倍）
│└Vector（底层为对象数组，容量默认为10，可按规定值扩容，默认为每次增长为原来的1倍,线程安全）
│　└Stack
├Set 
│ ├ hasSet （底层是由hashMap实现的，hashMap 的key存储hasSet的元素，value采用默认静的object）
│ ├treeSet
├Queue
    ├priorityQueue

Map
├Hashtable(基本同hashMap,只不过hashtable为线程安全的，不允许有null值)
├HashMap(Entry链表+数组，默认容量为16，负载因子为0.75;长度大于n*16*0.75则容量增大一倍)
└WeakHashMap
└LinkedHashMap
└TreeMap(底层为红黑树实现，继承自AbstractMap，而AbstractMap又实现了Map接口)
 LSortedMap
 * @author csdc
 *
 */
public class JavaSource {

	
	PriorityQueue priorityQueue = new PriorityQueue();
	Queue<Integer> queue = new PriorityQueue<Integer>();
	
	List arrayList = new ArrayList();
	List  link =  new LinkedList();
	List vector = new Vector();
	List stack = new Stack();
	
	
	Set hashSet = new HashSet();
	Set treeSet = new TreeSet();
	
	
	
	Map hashTable = new Hashtable();
	Map hashMap = new HashMap();
	Map weakHashMap = new WeakHashMap();
	
	Map linkedHashMap = new LinkedHashMap();
	
	Map treeMap = new TreeMap();
	
	Map  cocurrentHashMap = new ConcurrentHashMap();
	ConcurrentMap  concurrentHashMap = new  ConcurrentHashMap();
}

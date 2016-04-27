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
��List
����LinkedList  (�ײ���˫����ʵ��)
����ArrayList ���ײ�Ϊ�������飬����Ĭ��Ϊ10������1.5����ÿ������ԭ����0.5����
����Vector���ײ�Ϊ�������飬����Ĭ��Ϊ10���ɰ��涨ֵ���ݣ�Ĭ��Ϊÿ������Ϊԭ����1��,�̰߳�ȫ��
������Stack
��Set 
�� �� hasSet ���ײ�����hashMapʵ�ֵģ�hashMap ��key�洢hasSet��Ԫ�أ�value����Ĭ�Ͼ���object��
�� ��treeSet
��Queue
    ��priorityQueue

Map
��Hashtable(����ͬhashMap,ֻ����hashtableΪ�̰߳�ȫ�ģ���������nullֵ)
��HashMap(Entry����+���飬Ĭ������Ϊ16����������Ϊ0.75;���ȴ���n*16*0.75����������һ��)
��WeakHashMap
��LinkedHashMap
��TreeMap(�ײ�Ϊ�����ʵ�֣��̳���AbstractMap����AbstractMap��ʵ����Map�ӿ�)
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

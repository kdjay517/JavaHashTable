package com.bridglabz.hashtable;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> arrayList;

	public LinkedHashMap() {
		numBuckets = 10;
		arrayList = new ArrayList<>();
		for (int i = 0; i < numBuckets; i++) {
			arrayList.add(null);
		}
	}

	public V get(K key) {
		int indexNumber = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = arrayList.get(indexNumber);
		if (linkedList == null) {
			return null;
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		return mapNode == null ? null : mapNode.getValue();
	}
	
	public void remove(K key) {
		int indexNumber = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = arrayList.get(indexNumber);
		if (linkedList == null) {
			return;
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.deleteNode(key);
	}

	private int getBucketNumber(K key) {
		int hashCode = Math.abs(key.hashCode());
		return hashCode % this.numBuckets;
	}

	public void put(K key, V value) {

		int index = this.getBucketNumber(key);
		MyLinkedList<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new MyLinkedList<>();
			this.arrayList.set(index, linkedList);
		}

		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		if (mapNode == null) {
			mapNode = new MyMapNode<>(key, value);
			linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "LinkedHashMap [arrayList=" + arrayList + "]";
	}

}

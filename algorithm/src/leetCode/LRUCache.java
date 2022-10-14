package leetCode;

import java.util.HashMap;
import java.util.Map;

class Node {
    Node next;
    Node prev;
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    Map<Integer, Node> hashmap;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hashmap = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (hashmap.containsKey(key)) {
            Node node = hashmap.get(key);
            remove(node);
            add(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (hashmap.containsKey(key)) {
            Node node = hashmap.get(key);
            remove(node);
        }
        add(new Node(key, value));
        if (hashmap.size() > capacity) {
            remove(tail.prev);
        }
    }

    public void add(Node node) {
        Node first = head.next;
        head.next = node;
        first.prev = node;
        node.prev = head;
        node.next = first;
        hashmap.put(node.key, node);
    }

    public void remove(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = node.prev = null;
        hashmap.remove(node.key);
    }

}

class Main{
    public static void main(String[] args) {
        LRUCache test = new LRUCache(2);
        test.put(11, 1);
        test.hashmap.keySet().forEach(node -> System.out.println("key" + node));
        test.hashmap.values().forEach(node -> System.out.println("value" + node.value));
        test.put(22, 2);
        test.hashmap.keySet().forEach(node -> System.out.println("key" + node));
        test.hashmap.values().forEach(node -> System.out.println("value" + node.value));
        System.out.println("get" + test.get(11));
        test.put(33, 3);
        test.hashmap.keySet().forEach(node -> System.out.println("key" + node));
        test.hashmap.values().forEach(node -> System.out.println("value" + node.value));
    }
}


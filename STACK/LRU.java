package STACK;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    
Node head = new Node(0, 0), tail = new Node(0, 0);
    Map < Integer, Node > map = new HashMap();
    int capacity;
    //Constructor for initializing the cache capacity with the given value.
    LRU(int _capacity)
    {
        //code here
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
        
    }

    //Function to return value corresponding to the key.
    public  int get(int key)
    {
        // your code here
         if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    //Function for storing key-value pair.
    public  void set(int key, int value)
    {
        // your code here
          if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
     private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    class Node {
        Node prev, next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
}



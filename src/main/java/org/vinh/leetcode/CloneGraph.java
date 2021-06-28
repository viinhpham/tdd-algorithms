package org.vinh.leetcode;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author : Vinh Pham.
 * Date: 19/06/2021.
 * Time : 16:54.
 */
public class CloneGraph {

    class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return  null;
        }

        Map<Integer, Node> map = new HashMap<>();

        return cloneG(node, map);
    }
    public Node cloneG(Node current, Map<Integer, Node> map) {
        if (map.containsKey(current.val)) {
            return map.get(current.val);
        }

        Node copy = new Node(current.val);
        map.put(current.val, copy);

        for (Node neighbor :  current.neighbors) {
             map.get(current.val).neighbors.add(cloneG(neighbor, map));

        }
        return map.get(current.val);
    }
}
    
}

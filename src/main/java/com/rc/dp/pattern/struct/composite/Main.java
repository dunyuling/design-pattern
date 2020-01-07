package com.rc.dp.pattern.struct.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-12-10 下午6:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode b1 = new BranchNode("b1");
        Node b1_1 = new LeafNode("b1_1");
        Node b1_2 = new LeafNode("b1_2");
        BranchNode b2 = new BranchNode("b2");
        BranchNode b2_1 = new BranchNode("b2_1");
        Node b2_1_1 = new LeafNode("b2_1_1");
        Node b2_1_2 = new LeafNode("b2_1_2");
        Node b3 = new LeafNode("b3");

        root.add(b1);
        root.add(b2);
        root.add(b3);
        b1.add(b1_1);
        b1.add(b1_2);
        b2.add(b2_1);
        b2_1.add(b2_1_1);
        b2_1.add(b2_1_2);

        traverse(root, 0);
    }

    private static void traverse(Node node, int depth) {
        System.out.print("|");
        for (int i = 0; i < depth; i++) {
            System.out.print("----");
        }
        node.p();

        if (node instanceof BranchNode) {
            ((BranchNode) node).nodeList.forEach(node1 -> traverse(node1, depth + 1));
        }
    }
}

abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    protected abstract void p();
}

class BranchNode extends Node {

    List<Node> nodeList = new ArrayList<>();

    public BranchNode(String name) {
        super(name);
    }

    public void add(Node node) {
        nodeList.add(node);
    }

    @Override
    protected void p() {
        System.out.println(name);
    }
}

class LeafNode extends Node {

    public LeafNode(String name) {
        super(name);
    }

    @Override
    protected void p() {
        System.out.println(name);
    }
}
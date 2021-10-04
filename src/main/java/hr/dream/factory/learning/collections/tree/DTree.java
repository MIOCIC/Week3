package hr.dream.factory.learning.collections.tree;

import apple.laf.JRSUIUtils;
import hr.dream.factory.learning.collections.BaseCollection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DTree implements BaseCollection<Integer> {

    TreeNode head;
    public TreeNode getHead() {
        return head;
    }

    public DTree() {
    }

    @Override
    public void add(Integer o) {
        head = add_recursive(head, o);
    }
    public TreeNode add_recursive(TreeNode root,Integer o){
        //TreeNode n = new TreeNode(o);
        //TreeNode parent = root;

        if(root == null) {
            root = new TreeNode(o);
            return root;
        }
        if (o < root.value) {
            root.left = add_recursive(root.left, o);
        } else if (o > root.value) {
            root.right = add_recursive(root.right, o);
        }
        return root;


    }

    @Override
    public void remove(Integer o) {
        head = remove_recursion(head, o);
    }
    TreeNode remove_recursion(TreeNode root, Integer o){
        if (root == null) return root;

        if(o < root.value) root.left = remove_recursion(root.left, o);
        else if (o > root.value) root.right = remove_recursion(root.right, o);
        else {
            if(root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.value = minValue(root.right);
            root.right = remove_recursion(root.right, root.value);
        }
        return root;
    }

    public int minValue(TreeNode root) {
        int minval = root.value;
        while (root.left != null) {
            minval = root.left.value;
            root = root.left;
        }
        return minval;
    }
    @Override
    public int size() {
        return size_recursive(head);
    }

    public int size_recursive(TreeNode o) {
        if (o != null){
            return (1 + size_recursive(o.left) + size_recursive(o.right));
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String print() {
        return head.toString();
    }

    public void printEspecial(TreeNode root) {
        if (root == null) return;
      //  Queue q = new Queue(50);
        java.util.Queue<TreeNode> q = new LinkedList<TreeNode>();
      //  q.add(Integer.toString(root.value));
        q.add(root);
        while(true){
            int count = q.size();
            if (count == 0) break;

            while(count >0){
                //System.out.print(q.getBackingArray()[0] + " ");
                //q.dequeue();
                TreeNode n = q.remove();
                System.out.print(n.value + " ");
                //if(n.left != null) q.add(Integer.toString(n.left.value));
                //if(n.right != null) q.add(Integer.toString(n.right.value));
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
                //if(n.left != null) {
                //    n = n.left;
                //} else if (n.right!= null){
                //    n = n.right;
                //}
                count--;
            }
            System.out.println();

        }

    }

}

package hr.dream.factory.learning.collections.tree;

public class TreeNode {
    Integer value;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String result = value + "\n";

        if (left != null) {
            result += left.toString();
        }

        if (right != null) {
            result += right.toString();
        }

        return result;
        //if (right == null && left == null) { return value + "\n";}
        //if (right == null) { return value + "\n" + left.toString();}
        //if (left == null) { return value + "\n" + right.toString();}
        //return value + "\n" + right.toString() + "\n" + left.toString();
    }
}

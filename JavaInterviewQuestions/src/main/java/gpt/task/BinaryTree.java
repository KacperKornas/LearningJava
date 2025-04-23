package gpt.task;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {

    public int findDeepestLeaf(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("The tree is empty");
        }
        return findDeepestLeafHelper(root, 0).node.val;
    }

    private Result findDeepestLeafHelper(TreeNode node, int depth) {
        if (node == null) {
        return new Result(null, -1);
        }

        if (node.left == null && node.right == null) {
            return new Result(node, depth);
        }

        Result left = findDeepestLeafHelper(node.left, depth +1);
        Result right = findDeepestLeafHelper(node.right, depth + 1);

        return (left.depth > right.depth) ? left : right;
    }

    private static class Result {
        TreeNode node;
        int depth;

        Result(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        int deepestValue = tree.findDeepestLeaf(root);
        System.out.println("The value of the deepest leaf node is: " + deepestValue);
    }
}

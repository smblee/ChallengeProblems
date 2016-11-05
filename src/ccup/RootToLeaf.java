package ccup;

import java.util.*;

/**
 * Created by bryan on 10/31/2016.
 */
public class RootToLeaf {
    // https://www.careercup.com/question?id=5721708662095872
    private Deque<Integer> path =  new ArrayDeque<>();
    private List<String> res = new ArrayList<>();
    private TreeNode node;

    class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null; this.right = null;
        }
    }

    public RootToLeaf() {
        // initialize
        TreeNode h = new TreeNode(1);
        h.left = new TreeNode(2);
        h.left.left = new TreeNode(4);
        h.left.left.left = new TreeNode(7);
        h.left.left.right = new TreeNode(8);
        h.left.right = new TreeNode(5);
        h.right = new TreeNode(3);
        h.right.left = new TreeNode(6);
        h.right.left.left = new TreeNode(9);
        h.right.right = new TreeNode(10);
        node = h;

    }
    public void leafPath(TreeNode h) {
        if (h == null) {
            return;
        }
        path.add(h.val);
        if (h.left == null && h.right == null) {
            res.add(path.toString());
        } else {
            if (h.left != null)
                leafPath(h.left);
            if (h.right != null)
                leafPath(h.right);
        }
        path.removeLast();
        System.out.println(res);

    }

    public TreeNode getHead() {
        return node;
    }

    public static void main(String[] args) {
        RootToLeaf p = new RootToLeaf();
        p.leafPath(p.getHead());
    }
}

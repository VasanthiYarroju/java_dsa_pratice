// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        // If one subtree is missing, take the depth of the other
        if (root.left == null) return right + 1;
        if (root.right == null) return left + 1;

        // If both exist, take the smaller one
        return Math.min(left, right) + 1;
    }
}


public class Main {
    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        
        Solution sol = new Solution();
        int result = sol.minDepth(root);

      
        System.out.println("Minimum Depth of the Tree: " + result);
    }
}

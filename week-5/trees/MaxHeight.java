class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class MaxHeight {
      public int maxDepth(TreeNode root) {
        if (root == null) return 0; // base case
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        MaxHeight tree = new MaxHeight();
        int height = tree.maxDepth(root);
        System.out.println("Maximum height of the binary tree: " + height); // Output: 3
    }
}

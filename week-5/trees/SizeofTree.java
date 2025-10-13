class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class SizeofTree {
    public int sizeOfTree(TreeNode root){
        if(root==null) return 0;
        int left=sizeOfTree(root.left);
        int right=sizeOfTree(root.right);
        return left+right+1;
        }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        SizeofTree tree = new SizeofTree();
        int size = tree.sizeOfTree(root);
        System.out.println("Size of the binary tree: " + size);
    }
}

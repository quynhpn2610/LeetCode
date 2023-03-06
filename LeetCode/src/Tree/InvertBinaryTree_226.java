package Tree;

public class InvertBinaryTree_226 {
    public TreeNode invertBinaryTree(TreeNode root){
        if (root == null) return root;

        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;
    }
}

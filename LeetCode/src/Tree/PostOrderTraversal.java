package Tree;

public class PostOrderTraversal {
    public static void postOrder(TreeNode root){
        if (root == null) return;
        if (root.left != null){
            postOrder(root.left);
        }
        if (root.right != null){
            postOrder(root.right);
        }
        System.out.print(root.val + " ");
    }
}

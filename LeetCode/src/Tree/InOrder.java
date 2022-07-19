package Tree;

public class InOrder {
    public static void inOrder(TreeNode root) {
        if (root == null) return;

        if (root.left != null){
            inOrder(root.left);
        }

        System.out.print(root.val + " ");

        if (root.right != null){
            inOrder(root.right);
        }

    }
}

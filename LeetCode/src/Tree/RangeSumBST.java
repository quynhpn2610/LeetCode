package Tree;

public class RangeSumBST {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high){
        if (root == null) return sum;

        if (root.val >= low && root.val <= high){
            sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }

        if (root.val < low){
            rangeSumBST(root.right, low, high);
        }

        if (root.val > high){
            rangeSumBST(root.left, low, high);
        }

        return sum;
    }
}

package Tree;

import java.util.*;

public class TreeLevelOrderTraversal_102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        q.offer(root); // like q.add but also check if can be added
        q.offer(null);

        while(!q.isEmpty()){
            TreeNode node = q.poll(); // like stack.pop or q.remove but also check if can be removed
            if (node != null){
                level.add(node.val);
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
            else{
                res.add(new ArrayList<>(level));
                level.clear();
                if (!q.isEmpty()) q.offer(null); // moi lan add to q la add 1 level --> add null vao queue de danh dau het 1 level
            }
        }

        return res;
    }


    public static TreeNode insert(TreeNode root, int data) {
        if(root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if(data <= root.val) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        System.out.println(levelOrder(root));
    }
}

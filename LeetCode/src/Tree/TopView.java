package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class TopView {
    public static void topView(TreeNode root) {
        if (root == null) return;

        // key = height & value = node.data
        TreeMap <Integer, Integer> m = new TreeMap<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            TreeNode temp = q.remove();
            int hd = temp.height;

            // if height is not in map, then put the height and value
            if (m.get(hd) == null){
                m.put(hd, temp.val);
            }

            // check temp.left & right
            if (temp.left != null) {
                temp.left.height = hd - 1;
                q.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.height = hd + 1;
                q.add(temp.right);
            }
        }
        for (int i:
             m.keySet()) {
            System.out.print(m.get(i) + " ");
        }

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
        topView(root);
    }
}


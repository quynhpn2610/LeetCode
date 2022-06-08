package NaryTreeTraversal_589;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PreorderTraversal {
    public List<Integer> preorder(Node root){
        List<Integer> ans = new LinkedList<>();
        preorderTraversal(root, ans);
        return ans;
    }
    private void preorderTraversal(Node root, List<Integer> ans){
        if (root == null) return;
        
        ans.add(root.val);

        for (Node child:
             root.children) {
            preorderTraversal(child, ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}

/*
    Created by : Kumar Sudarshan
    Date : 11th Feb 2018
    Binary Tree Traversals
 */

package Trees;

public class BinaryTreeTraversal {

    static void traverseBinaryTree(BinaryTreeNode root){
        System.out.println("\nPreOrder Traversal : ");
        BinaryTreeTraversal.preOrderTraveral(root);
        System.out.println("\nInOrder Traversal : ");
        BinaryTreeTraversal.inOrderTraveral(root);
        System.out.println("\nPostOrder Traversal : ");
        BinaryTreeTraversal.postOrderTraveral(root);
    }

    static void preOrderTraveral(BinaryTreeNode root) {
        if (root != null) {
            System.out.print("\t" + root.getData());
            preOrderTraveral(root.getLeft());
            preOrderTraveral(root.getRight());
        }
    }

    static void inOrderTraveral(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraveral(root.getLeft());
            System.out.print("\t" + root.getData());
            inOrderTraveral(root.getRight());
        }
    }

    static void postOrderTraveral(BinaryTreeNode root) {
        if (root != null) {
            postOrderTraveral(root.getLeft());
            postOrderTraveral(root.getRight());
            System.out.print("\t" + root.getData());
        }
    }
}
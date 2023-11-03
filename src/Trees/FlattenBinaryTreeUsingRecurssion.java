package Trees;

import org.w3c.dom.Node;

class BinaryTree{
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    Node root;
    BinaryTree(){
        root = null;
    }

    public  void  insert(int val){
        root = addNode(root,val);
    }
    public Node addNode(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return  root;
        }
        if(val <= root.val){
            root.left = addNode(root.left,val);
        }else{
            root.right  = addNode(root.right , val);
        }
        return  root;
    }

    public  void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversal(root.right);
    }
}

public class FlattenBinaryTreeUsingRecurssion
{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(15);
        tree.insert(35);
        tree.insert(55);
        tree.insert(75);

        tree.inorderTraversal(tree.root);
    }
}

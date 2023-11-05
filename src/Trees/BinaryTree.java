package Trees;

import java.util.Stack;

class BinaryTree{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    Node prev = null;
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

    public void FlattenTree(Node root){

        if(root == null){
            return;
        }
        FlattenTree(root.right);
        FlattenTree(root.left);

        root.right = prev;
        root.left = null;
        prev = root;

    }

    public void FlattenUsingStack(Node root){

        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.empty()){
            Node curr = st.pop();
            if(curr.right != null){
                st.push(curr.right);
            }
            if(curr.left != null){
                st.push(curr.left);
            }
            if(!st.empty()){
                curr.right = st.peek();
            }
            curr.left = null;

        }
    }

    public  void  printFlattenTree(Node root){
        while(root!=null){
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

}

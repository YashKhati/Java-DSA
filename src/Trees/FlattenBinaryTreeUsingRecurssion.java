package Trees;
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
        tree.FlattenTree(tree.root);

        tree.printFlattenTree(tree.root);
    }
}

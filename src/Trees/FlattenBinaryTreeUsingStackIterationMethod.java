package Trees;

public class FlattenBinaryTreeUsingStackIterationMethod
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
        System.out.println("Print Flatten tree using stack : ");
        tree.FlattenUsingStack(tree.root);
        tree.printFlattenTree(tree.root);
    }
}

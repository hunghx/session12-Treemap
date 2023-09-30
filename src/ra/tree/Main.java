package ra.tree;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> tree = new TreeNode<>(50); // node  gốc
        tree.left = new TreeNode<>(25);
        tree.right = new TreeNode<>(75);
        tree.left.left = new TreeNode<>(10);
        tree.left.right = new TreeNode<>(26);
        // Inorder :  Trái - Gốc - Phải
        // Postorder: Trái - Phải - Gốc
        // PreOrder : Gốc - Trái -Phải

    /*
                            50
                          /    \
                         25     75
                        /  \
                       10   26

     */
    }

}

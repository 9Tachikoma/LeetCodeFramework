public class ntreeTraverse {
    /* 基本的 N 叉树节点 */
    class TreeNode {
        int val;
        TreeNode[] children;
    }

    void traverse(TreeNode root) {
        for (TreeNode child : root.children)
            traverse(child);
}

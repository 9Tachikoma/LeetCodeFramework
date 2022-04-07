public class arrTraverse {
    /* 迭代遍历数组 */
    void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
    }

    /* 递归遍历数组 */
    void traverse(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        // 前序位置
        traverse(arr, i + 1);
        // 后序位置
        //前序位置的代码只能从函数参数中获取父节点传递来的数据，而后序位置的代码不仅可以获取参数数据，还可以获取到子树通过函数返回值传递回来的数据。
        //一旦你发现题目和子树有关，那大概率要给函数设置合理的定义和返回值，在后序位置写代码了。
    }

}

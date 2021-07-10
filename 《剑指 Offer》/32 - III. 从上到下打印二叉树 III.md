#### [剑指 Offer 32 - III. 从上到下打印二叉树 III](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)

> - 执行用时：1 ms, 在所有 Java 提交中击败了99.87%的用户

```java
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if((depth & 1) == 0){
                    temp.add(node.val);
                }else{
                    temp.add(0, node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            depth++;
            res.add(temp);
        }
        return res;
    }
}
```


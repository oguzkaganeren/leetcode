/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //Integer yapma nedenimiz daha once bir degerin olmamasi
        Integer prev=null;
        int current;
        int max;
        List<Integer> mod=new ArrayList<>();  
    public int[] findMode(TreeNode root) {
          inOrder(root);
          int len=mod.size();
          int[] retArr=new int[len];
          for(int i = 0; i< len;i++){
            retArr[i]=mod.get(i);
          }
          return retArr;
    }
    private void inOrder(TreeNode node){
        if(node==null) return;
        inOrder(node.left);
        if(prev!=null && prev==node.val){
            current++;
        }else{
            current=1;
        }
        if(current>max){
            mod.clear();
            mod.add(node.val);
            max=current;
        }else if(current==max){
            mod.add(node.val);
        }
        prev=node.val;
        inOrder(node.right);
    }
}
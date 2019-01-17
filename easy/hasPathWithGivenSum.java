//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if(t == null)
        return false;
    
    if(t.left == null && t.right == null && t.value == s)
        return true;
    
    if(t.left != null && hasPathWithGivenSum(t.left, s - t.value))
        return true;
    if(t.right != null && hasPathWithGivenSum(t.right, s - t.value))
        return true;
    
    return false;
}

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
boolean isTreeSymmetric(Tree<Integer> t) {
    if(t == null)
        return true;
    
    return isSubTreeSymmetric(t.left, t.right);
}

boolean isSubTreeSymmetric(Tree<Integer> left, Tree<Integer> right) {
    if(left == null && right == null)
        return true;
    else if(left == null || right == null)
        return false;
    
    if(!left.value.equals(right.value))
        return false;
    
    boolean outer = isSubTreeSymmetric(left.left, right.right);
    boolean inner = isSubTreeSymmetric(left.right, right.left);
    
    return outer && inner;
}

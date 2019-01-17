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
int[] traverseTree(Tree<Integer> t) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Queue<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
    
    queue.add(t);
    while(queue.peek() != null) {
        Tree<Integer> node = queue.poll();
        if(node.left != null)
            queue.add(node.left);
        if(node.right != null)
            queue.add(node.right);
        result.add(node.value);
    }
    
    int[] castResult = new int[result.size()];
    for(int i = 0; i < castResult.length; i++)
        castResult[i] = result.get(i);
    
    return castResult;
}

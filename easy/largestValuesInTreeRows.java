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
int[] largestValuesInTreeRows(Tree<Integer> t) {
    if(t == null) {
        int[] result = {};
        return result;
    }
    
    List<Integer> maxs = new ArrayList<Integer>();
    List<Tree<Integer>> row = new ArrayList<Tree<Integer>>();
    row.add(t);
    
    while(row.size() > 0) {
        List<Integer> values = new ArrayList<Integer>();
        List<Tree<Integer>> newRow = new ArrayList<Tree<Integer>>();
        for(Tree<Integer> node : row) {
            values.add(node.value);
            
            if(node.left != null)
                newRow.add(node.left);
            if(node.right != null)
                newRow.add(node.right);
        }
        row = newRow;
        
        int max = findMax(values);
        maxs.add(max);
    }
    
    int[] result = new int[maxs.size()];
    for(int i = 0; i < result.length; i++)
        result[i] = maxs.get(i);
    
    return result;
}

int findMax(List<Integer> row) {
    int max = Integer.MIN_VALUE;
    
    for(int i : row) {
        if(i > max)
            max = i;
    }
    
    return max;
}

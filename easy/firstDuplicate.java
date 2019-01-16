int firstDuplicate(int[] a) {
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int i : a) {
        if(set.contains(i))
            return i;
        else
            set.add(i);
    }
    
    return -1;
}

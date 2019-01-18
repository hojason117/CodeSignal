boolean areFollowingPatterns(String[] strings, String[] patterns) {
    HashMap<String, String> map = new HashMap<String, String>();
    HashSet<String> encountered = new HashSet<String>();
    
    for(int i = 0; i < patterns.length; i++) {
        if(!map.containsKey(patterns[i])) {
            if(!encountered.contains(strings[i])) {
                map.put(patterns[i], strings[i]);
                encountered.add(strings[i]);
            }
            else
                return false;
        }
        else {
            if(!strings[i].equals(map.get(patterns[i])))
                return false;
        }
    }
    
    return true;
}

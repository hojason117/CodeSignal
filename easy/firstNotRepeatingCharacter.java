char firstNotRepeatingCharacter(String s) {
    int[] letters = new int[26];
    int[] appearance = new int[26];
    Arrays.fill(appearance, -1);
    for(int i = 0; i < s.length(); i++) {
        letters[s.charAt(i) - 'a']++;
        if(appearance[s.charAt(i) - 'a'] == -1)
            appearance[s.charAt(i) - 'a'] = i;
    }
    
    int result = Integer.MAX_VALUE;
    for(int i = 0; i < 26; i++) {
        if(letters[i] == 1 && appearance[i] < result)
            result = appearance[i];
    }
    
    if(result == Integer.MAX_VALUE)
        return '_';
    else
        return s.charAt(result);
}

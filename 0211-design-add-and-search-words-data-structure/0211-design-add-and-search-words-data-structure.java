class TrieNode
{
    boolean isComplete;
    TrieNode[] children;
    public TrieNode()
    {
        isComplete = false;
        children = new TrieNode[27];
    }
}


class WordDictionary {
     TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
         TrieNode temp = root;
        for(char c:word.toCharArray())
        {

                int pos = c-'a';
                if(temp.children[pos]==null)
                {
                    temp.children[pos] = new TrieNode();
                }
                temp = temp.children[pos];
        }
        temp.isComplete = true;
    }
    
    public boolean search(String word) {
    return searchFrom(root, word, 0);
}

private boolean searchFrom(TrieNode node, String word, int index) {
    if (index == word.length()) {
        return node.isComplete;
    }
    
    char currentChar = word.charAt(index);
    
    if (currentChar == '.') {
        for (TrieNode child : node.children) {
            if (child != null && searchFrom(child, word, index + 1)) {
                return true;
            }
        }
    } else {
        int pos = currentChar - 'a';
        if (node.children[pos] != null) {
            return searchFrom(node.children[pos], word, index + 1);
        }
    }
    
    return false;
}
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
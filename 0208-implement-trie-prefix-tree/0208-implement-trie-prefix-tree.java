class TrieNode
{
    boolean isComplete;
    TrieNode[] children;
    public TrieNode()
    {
        isComplete = false;
        children = new TrieNode[26];
    }
}



class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
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
        TrieNode temp = root;
        for(char c:word.toCharArray())
        {
            int pos = c-'a';
            if(temp.children[pos]==null)
            {
                return false;
            }
            temp  =temp.children[pos];
        }
        return temp.isComplete;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char c:prefix.toCharArray())
        {
            int pos = c-'a';
            if(temp.children[pos]==null)
            {
                return false;
            }
            temp  =temp.children[pos];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
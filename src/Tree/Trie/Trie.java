package Tree.Trie;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("Trie has been created");
        //Time Complexity = O(1)
        //Space Complexity = O(1)
    }

    void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }

            current = node;
        }

        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in  Trie");


        //Time Complexity = O(N)
        //Space Complexity = O(N)
    }


    boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);

            if (node == null) {
                System.out.println("The word: " + word + " does not exists in the Trie");
                return false;
            }

            current = node;
        }

        if (current.endOfString) {
            System.out.println("The word: " + word + " Exists in the Trie");
            return true;
        } else {
            System.out.println("The word: " + word + " does not exists in the Trie. But is a prefix of another string");
        }

        return current.endOfString;

        //Time Complexity = O(N)
        //Space Complexity = O(1)
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (currentNode.endOfString) {
            delete(currentNode, word, index+1);
            return false;
        }

        canThisNodeBeDeleted = delete(currentNode, word, index+1);

        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    void delete(String word) {
        delete(root, word, 0);
    }
}

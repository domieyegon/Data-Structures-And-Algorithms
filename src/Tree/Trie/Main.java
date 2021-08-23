package Tree.Trie;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");

        trie.search("APIS");
        trie.search("API");

        trie.delete("API");
        trie.search("APIS");
        trie.search("API");

    }

}

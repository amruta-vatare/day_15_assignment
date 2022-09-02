public class HashTableTest {
    public static void main(String[] args) {
        int words_count = 0;
        String str ="To be or not to be";
        String [] words = str.split(" ");
        System.out.println("Welcome to hash table");
        HashTable<String,Integer> hs = new HashTable<>();
        for(int i = 0;i<words.length;i++){
            hs.put(words[i],1);
        }
        for(int i = 0;i<words.length;i++){
            Object s =  hs.get(words[i]);
            System.out.println(words[i] +" "+s.toString());
        }


    }
}

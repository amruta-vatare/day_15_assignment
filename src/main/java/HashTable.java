
public class HashTable<k,v> {
private int INITIAL_SIZE = 16;
private HashEntry[] data;

    HashTable(){
        data = new HashEntry[INITIAL_SIZE];
    }
    public Object get(k key){
        int index = getIndex(key);
        HashEntry entries = data[index];
        if(entries != null){
            while(!entries.key.equals(key) && entries.next!= null){
                entries = entries.next;
            }
            return entries.value;
        }
            return null;
    }

    public void put(k key,v value){
        int index = getIndex(key);
        HashEntry entry = new HashEntry(key,value);
        if(data[index]  == null){
            data[index] = entry;
        }else{
            HashEntry entries = data[index];
            while(entries.next != null){
                entries = entries.next;
            }
            entries.next = entry;
        }
    }

    private int getIndex(k key){
        int hashcode = key.hashCode();
        int index = hashcode%INITIAL_SIZE;
        return index;
    }

}

import org.w3c.dom.Node;

public class HashEntry<k,v> {
    k key;
    v value;
    HashEntry next;

    public HashEntry(k key, v value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

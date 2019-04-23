import java.util.ArrayList;
import java.util.List;

public class Node {
    int id;
    int entutyId;
    int parentId;
    List<Node> children;

    public Node(int id, int entutyId, int parentId) {
        this.id = id;
        this.entutyId = entutyId;
        this.parentId = parentId;
        this.children = new ArrayList<Node>();
    }
}

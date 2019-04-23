import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nod = new ArrayList<Node>();

        Node[] nodes = {new Node(1,1,0),
                new Node(2,2,0),
                new Node(3,3,1),
                new Node(4,4,3),
                new Node(5,5,4),
                new Node(6,6,0),
                new Node(7,7,4),
                new Node(8,8,4),
        };

        makeArray(nodes);
    }

    public static ArrayList<Node> makeArray(Node[] nodes){
        ArrayList<Node> nod = new ArrayList<Node>();
        for(int i = 0; i < nodes.length; i++)
            if(nodes[i].parentId == 0)
                nod.add(nodes[i]);
            else
                for(Node n : nodes)
                    if(n.id == nodes[i].parentId)
                        n.children.add(nodes[i]);
        return nod;
    }
}

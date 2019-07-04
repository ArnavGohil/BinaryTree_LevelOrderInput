import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

  public static void main(String[] args)
  {
    BinaryTree bt = new BinaryTree();
  }

  private static class BinaryTree {
    public BinaryTree()
    {
      root = takeInput();
    }

    static Scanner s = new Scanner(System.in);

    static class Node {
      int data;
      Node left;
      Node right;

      public Node(int data)
      {
        this.data = data;
      }
    }

    private Node root;

    private static Node takeInput()
    {
      int rootData = s.nextInt();
      if (rootData == -1)
      {
        return null;
      }

      Node rootNode = new Node(rootData);

      Queue<Node> pn = new LinkedList<>();
      pn.add(rootNode);

      while (!pn.isEmpty())
      {
        Node fn = pn.remove();
        int lc = s.nextInt();
        if (lc != -1)
        {
          Node leftChild = new Node(lc);
          fn.left = leftChild;
          pn.add(leftChild);
        }
        int rc = s.nextInt();
        if (rc != -1)
        {
          Node rightChild = new Node(rc);
          fn.right = rightChild;
          pn.add(rightChild);
        }

      }
      return rootNode;
    }

  }
}

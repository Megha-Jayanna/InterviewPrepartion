package DSA;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;


    public Node(int data) {
        this.data = data;
    }
}

public class BinarySearchTreeExample {
    Node root;

    public void insert(int data){
        root= insertRec(root,data);
    }

    public Node insertRec(Node root, int data){
        if(root == null)
            root= new Node(data);
        else if(data < root.data)
            root.left= insertRec(root.left, data);
        else if(data > root.data)
            root.right= insertRec(root.right, data);

        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if(root !=null){
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder(){
        postorderREc(root);
    }

    private void postorderREc(Node root) {
        if(root !=null){
            postorderREc(root.left);
            postorderREc(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void levelOrder(){
        levelorder(root);
    }

    private void levelorder(Node root) {
//        System.out.print(root.data+" ");
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while( !q.isEmpty()){
            Node currentNode= q.remove();
            if(currentNode ==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data+ " ");
                if(currentNode.left !=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right !=null)
                    q.add(currentNode.right);
            }
        }


    }

    public static void main(String[] args) {
        BinarySearchTreeExample b= new BinarySearchTreeExample();
        b.insert(8);
        b.insert(7);
        b.insert(12);
        b.insert(15);
        b.insert(2);
        b.insert(5);

        System.out.println("Inorder elements");
        b.inorder();
        System.out.println();
        System.out.println("Preorder elements");
        b.preorder();
        System.out.println();
        System.out.println("Post elements");
        b.postorder();
        System.out.println();
        System.out.println("Level Order elements");
        b.levelOrder();
    }
}


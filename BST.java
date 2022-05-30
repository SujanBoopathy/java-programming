/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author Saubali
 */
public class BST {
    class Node{
        int key;
        Node left,right;
        public Node(int key){
            this.key=key;
            left=right=null;
        }
    }
    
    Node root;
    BST(){
        root=null;
    }
    
    void insert(int key){
        root=insertKey(root,key);
    }
    Node insertKey(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insertKey(root.left,key);
        else if(key>root.key)
            root.right=insertKey(root.right,key);
            
        return root;
    }
    
    void inorder(){
        printInOrder(root);
        System.out.print("NULL");
    }
    void printInOrder(Node root){
        if(root!=null){
            printInOrder(root.left);
            System.out.print(root.key+"->");
            printInOrder(root.right);
        }
        
    }
    public static void main(String args[]){
        BST bst=new BST();
        bst.insert(9);
        bst.insert(7);
        bst.insert(91);
        bst.insert(59);
        bst.insert(95);
        bst.insert(97);
        bst.inorder();
    }
}

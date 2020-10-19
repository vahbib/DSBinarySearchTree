package com.day17;

    class bNode<K extends Comparable<K>> {
        K key;
        bNode<K> left;
        bNode<K> right;

        bNode(K key)
        {
            this.key=key;
            left=null;
            right=null;
        }
    }
public class BinaryST<K extends Comparable> {

    bNode root=null;
    public void add(K key) {
        root=addRecursively(root,key);
    }

    private bNode addRecursively(bNode present, K key) {
        if(present==null)
            return new bNode(key);
        int size=key.compareTo(present.key);
        if(size==0){
            return present;
        }
        else if(size>0){
            present.right=addRecursively(present.right,key);
        }
        else{
            present.left=addRecursively(present.left,key);
        }
        return present;
    }

    public int getSize() {
        return size(root);
    }

    private int size(bNode current) {
        return current == null ? 0 : 1 + size(current.left) + size(current.right);
    }

    public boolean searchKey(K key) {
        return searchRec(root,key);
    }

    private boolean searchRec(bNode curr, K key) {
        boolean present;
        if(key.compareTo(curr.key)==0){
            present= true;
        }
        else if(key.compareTo(curr.key)>0){
            if(curr.right==null)
                present= false;
            else
                present=searchRec(curr.right, key);
        }
        else{
            if(curr.left==null)
                present= false;
            else
                present=searchRec(curr.left, key);
        }
        return present;
    }
}

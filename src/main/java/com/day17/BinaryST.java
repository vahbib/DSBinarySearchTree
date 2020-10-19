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


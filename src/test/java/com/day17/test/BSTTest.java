package com.day17.test;

import com.day17.BinaryST;
import org.junit.Test;
import org.junit.Assert;

public class BSTTest {
    @Test
    public void givenNodes_shouldReturnBST() {
        BinaryST bst = new BinaryST();
        bst.add(51);
        bst.add(32);
        bst.add(75);
        bst.add(5);
        bst.add(38);
        bst.add(89);
        int size = bst.getSize();
        Assert.assertEquals(6,size);
    }

    @Test
    public void given_BST_searchReturns()
    {
        BinaryST bst= new BinaryST();
        bst.add(51);
        bst.add(32);
        bst.add(75);
        bst.add(5);
        bst.add(38);
        bst.add(89);
        Assert.assertTrue(bst.searchKey(5));
    }

}

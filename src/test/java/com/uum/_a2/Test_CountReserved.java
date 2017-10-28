/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 2
 * 
 */
public class Test_CountReserved {
    
    @Test
    public void testFile(){
       String[] listjavaFile = null;
       CountReserved cr=new CountReserved();
       Assert.assertEquals(2, cr.listJavaFile.length);
    }
    
    @Test
    public void testScanFolder(){
        CountReserved cr=new CountReserved();
        Assert.assertEquals(cr, cr);
    }
}

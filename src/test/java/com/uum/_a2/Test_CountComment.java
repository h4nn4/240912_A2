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
 * @author Asus
 */
public class Test_CountComment {
    RunSystem rs = new RunSystem();
    FilterFile ff = new FilterFile();
    CountReserved issue = new CountReserved(); //CariIssue class
    String[] jList = issue.listJavaFile; //call return from method cariJavaIssue()
    
    @Test
    public void testComment(){
        CountComment cc=new CountComment();
        Assert.assertEquals(13, cc.countComment(jList));
    }
}

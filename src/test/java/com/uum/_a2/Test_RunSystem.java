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
public class Test_RunSystem {

    RunSystem rs = new RunSystem();
    FilterFile ff = new FilterFile();
    CountReserved issue = new CountReserved(); //CariIssue class
    String[] jList = issue.listJavaFile; //call return from method cariJavaIssue()

    @Test
    public void testMain() {
        rs.setNoMain(rs.countMain(jList, 0));
        Assert.assertEquals(2, rs.getNoMain());
    }

    @Test
    public void testWhile() {
        rs.setNoWhile(rs.countWhile(jList, 0));
        Assert.assertEquals(0, rs.getNoWhile());
    }

    @Test
    public void testThis() {
        rs.setNoThis(rs.countThis(jList, 0));
        Assert.assertEquals(0, rs.getNoThis());

    }

    @Test
    public void testFor() {
        rs.setNoFor(rs.countFor(jList, 0));
        Assert.assertEquals(0, rs.getNoFor());
    }

    @Test
    public void testClass() {
        //  RunSystem rs = new RunSystem();
        rs.setNoClass(rs.countClass(jList));
        Assert.assertEquals(2, rs.getNoClass());
    }

    @Test
    public void testNew() {

        rs.setNoNew(rs.countNew(jList));
        Assert.assertEquals(3, rs.getNoNew());
    }

    @Test
    public void testIf() {
        rs.setNoIf(rs.countIf(jList));
        Assert.assertEquals(0, rs.getNoIf());
    }

    @Test
    public void testExtends() {
        rs.setNoExtends(rs.countExtends(jList));
        Assert.assertEquals(2, rs.getNoExtends());
    }

    @Test
    public void testPackage() {

        rs.setNoPackage(rs.countPackage(jList));
        Assert.assertEquals(2, rs.getNoPackage());
    }

    @Test
    public void testVoid() {
        rs.setNoVoid(rs.countVoid(jList));
        Assert.assertEquals(4, rs.countVoid(jList));
    }

    @Test
    public void testTry() {
        rs.setNoTry(rs.countTry(jList));
        Assert.assertEquals(0, rs.getNoTry());
    }

    @Test
    public void testCatch() {
        rs.setNoCatch(rs.countCatch(jList));
        Assert.assertEquals(0, rs.getNoCatch());
    }

    @Test
    public void testPublic() {
        rs.setNoPublic(rs.countPublic(jList));
        Assert.assertEquals(4, rs.getNoPublic());
    }

    @Test
    public void testStatic() {
        rs.setNoStatic(rs.countStatic(jList));
        Assert.assertEquals(2, rs.getNoStatic());
    }

    @Test
    public void testInt() {
        rs.setNoInt(rs.countInt(jList));
        Assert.assertEquals(9, rs.getNoInt());
    }

    @Test
    public void testDouble() {
        rs.setNoDouble(rs.countDouble(jList));
        Assert.assertEquals(0, rs.getNoDouble());
    }

    @Test
    public void testString() {
        rs.setNoString(rs.countString(jList));
        Assert.assertEquals(2, rs.getNoString());
    }

    @Test
    public void testFloat() {
        rs.setNoFloat(rs.countFloat(jList));
        Assert.assertEquals(0, rs.getNoFloat());
    }

    @Test
    public void testDo() {
        rs.setNoDo(rs.countDo(jList));
        Assert.assertEquals(0, rs.getNoDo());
    }

    @Test
    public void testFinal() {
        rs.setNoFinal(rs.countFinal(jList));
        Assert.assertEquals(0, rs.getNoFinal());
    }

    @Test
    public void testLong() {
        rs.setNoLong(rs.countLong(jList));
        Assert.assertEquals(0, rs.getNoLong());
    }

    @Test
    public void testThrow() {
        rs.setNoThrow(rs.countThrow(jList));
        Assert.assertEquals(0, rs.getNoThrow());

    }

    @Test
    public void testThrows() {
        rs.setNoThrows(rs.countThrows(jList));
        Assert.assertEquals(0, rs.getNoThrows());
    }

    @Test
    public void testPrivate() {
        rs.setNoPrivate(rs.countPrivate(jList));
        Assert.assertEquals(0, rs.getNoPrivate());
    }

    @Test
    public void testProtected() {
        rs.setNoProtected(rs.countProtected(jList));
        Assert.assertEquals(0, rs.getNoProtected());
    }

    @Test
    public void testDefault() {
        rs.setNoDefault(rs.countDefault(jList));
        Assert.assertEquals(0, rs.getNoDefault());
    }

    @Test
    public void testNull() {
        rs.setNoNull(rs.countNull(jList));
        Assert.assertEquals(0, rs.getNoNull());
    }

    @Test
    public void testEnum() {
        rs.setNoRnum(rs.countEnum(jList));
        Assert.assertEquals(0, rs.getNoRnum());
    }

    @Test
    public void testTrue() {
        rs.setNoTrue(rs.countTrue(jList));
        Assert.assertEquals(0, rs.getNoTrue());
    }

    @Test
    public void testFalse() {
        rs.setNoFalse(rs.countFalse(jList));
        Assert.assertEquals(0, rs.getNoFalse());
    }

    @Test
    public void testAbstract() {
        rs.setNoAbstract(rs.countAbstract(jList));
        Assert.assertEquals(0, rs.getNoAbstract());
    }

    @Test
    public void testImplements() {
        rs.setNoImplements(rs.countImplements(jList));
        Assert.assertEquals(0, rs.getNoImplements());
    }

    @Test
    public void testReturn() {
        rs.setNoReturn(rs.countReturn(jList));
        Assert.assertEquals(0, rs.getNoReturn());
    }

    @Test
    public void testInstanceOf() {
        rs.setNoInstanceof(rs.countInstanceOf(jList));
        Assert.assertEquals(0, rs.getNoInstanceof());
    }

    @Test
    public void testContinue() {
        rs.setNoContinue(rs.countContinue(jList));
        Assert.assertEquals(0, rs.getNoContinue());
    }

    @Test
    public void testChar() {
        rs.setNoChar(rs.countChar(jList));
        Assert.assertEquals(0, rs.getNoChar());
    }

    @Test
    public void testImport() {
        rs.setNoImport(rs.countImport(jList));
        Assert.assertEquals(0, rs.getNoImport());
    }

    @Test
    public void testBoolean() {
        rs.setNoBoolean(rs.countBoolean(jList));
        Assert.assertEquals(0, rs.getNoBoolean());
    }

    @Test
    public void testSwitch() {
        rs.setNoSwitch(rs.countSwitch(jList));
        Assert.assertEquals(0, rs.getNoSwitch());
    }

    @Test
    public void testCase() {
        rs.setNoCase(rs.countCase(jList));
        Assert.assertEquals(0, rs.getNoCase());
    }

    @Test
    public void testBreak() {
        rs.setNoBreak(rs.countBreak(jList));
        Assert.assertEquals(0, rs.getNoBreak());
    }

    @Test
    public void testByte() {
        rs.setNoByte(rs.countByte(jList));
        Assert.assertEquals(0, rs.getNoByte());
    }

    @Test
    public void testInterface() {
        rs.setNoInterface(rs.countInterface(jList));
        Assert.assertEquals(0, rs.getNoInterface());
    }

    @Test
    public void testVolatile() {
        rs.setNoVolatile(rs.countVolatile(jList));
        Assert.assertEquals(0, rs.getNoVolatile());
    }

    @Test
    public void testShort() {
        rs.setNoShort(rs.countShort(jList));
        Assert.assertEquals(0, rs.getNoShort());
    }

    @Test
    public void testNative() {
        rs.setNoNative(rs.countNative(jList));
        Assert.assertEquals(0, rs.getNoNative());
    }

    @Test
    public void testSuper() {
        rs.setNoSuper(rs.countSuper(jList));
        Assert.assertEquals(0, rs.getNoSuper());
    }

    @Test
    public void testTransient() {
        rs.setNoTransient(rs.countTransient(jList));
        Assert.assertEquals(0, rs.getNoTransient());
    }

    @Test
    public void testGoto() {
        rs.setNoGoto(rs.countGoto(jList));
        Assert.assertEquals(0, rs.getNoGoto());
    }

    @Test
    public void testStrictft() {
        rs.setNoSuper(rs.countStrictft(jList));
        Assert.assertEquals(0, rs.getNoStrictfp());
    }
    
    @Test
    public void testSyncronized(){
        rs.setNoSyncronized(rs.countSynchronized(jList));
        Assert.assertEquals(0, rs.getNoSyncronized());
    }

    @Test
    public void testFinally() {
        rs.setNoFinally(rs.countFinally(jList));
        Assert.assertEquals(0, rs.getNoFinally());
    }

    @Test
    public void testElse() {
        rs.setNoElse(rs.countElse(jList));
        Assert.assertEquals(0, rs.getNoElse());
    }

    @Test
    public void test_noBLine() {
        Assert.assertEquals(12, rs.countBLines(jList));
    }

    @Test
    public void testLOC() {
        Assert.assertEquals(54, rs.countLines(jList));
    }

    @Test
    public void testAOC() {
        int aoc = rs.countLines(jList) - rs.countBLines(jList);
        Assert.assertEquals(42, aoc);
    }

}

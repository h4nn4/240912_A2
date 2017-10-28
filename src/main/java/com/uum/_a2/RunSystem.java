/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 1
 *
 */
public class RunSystem extends Thread {

    static String filename;
    private int noMain, noThis, noWhile, noIf, noClass, noCatch, noThrow, noThrows;
    private int noString, noInt, noDouble, noShort, noBoolean, noLong, noChar;//15
    private int noPublic, noProtected, noPrivate, noDefault, noTry, noSwitch, noCase, noBreak;//23
    private int noDo, noFinal, noFinally, noCons, noFloat, noStatic, noFor, noSuper, noSyncronized;//32
    private int noTrue, noFalse, noNative, noNew, noNull, noPackage, noVoid, noReturn, noVolatile, noContinue;//43
    private int noStrictfp, noTransient, noImplements, noImport, noInstanceof, noInterface, noGoto;//50
    private int noRnum, noExtends, noAbstract, noAssert, noConst, noByte, noElse;

    public int getNoElse() {
        return noElse;
    }

    public void setNoElse(int noElse) {
        this.noElse = noElse;
    }

    public static void setFilename(String filename) {
        RunSystem.filename = filename;
    }

    public void setNoMain(int noMain) {
        this.noMain = noMain;
    }

    public void setNoThis(int noThis) {
        this.noThis = noThis;
    }

    public void setNoWhile(int noWhile) {
        this.noWhile = noWhile;
    }

    public void setNoIf(int noIf) {
        this.noIf = noIf;
    }

    public void setNoClass(int noClass) {
        this.noClass = noClass;
    }

    public void setNoCatch(int noCatch) {
        this.noCatch = noCatch;
    }

    public void setNoThrow(int noThrow) {
        this.noThrow = noThrow;
    }

    public void setNoThrows(int noThrows) {
        this.noThrows = noThrows;
    }

    public void setNoString(int noString) {
        this.noString = noString;
    }

    public void setNoInt(int noInt) {
        this.noInt = noInt;
    }

    public void setNoDouble(int noDouble) {
        this.noDouble = noDouble;
    }

    public void setNoShort(int noShort) {
        this.noShort = noShort;
    }

    public void setNoBoolean(int noBoolean) {
        this.noBoolean = noBoolean;
    }

    public void setNoLong(int noLong) {
        this.noLong = noLong;
    }

    public void setNoChar(int noChar) {
        this.noChar = noChar;
    }

    public void setNoPublic(int noPublic) {
        this.noPublic = noPublic;
    }

    public void setNoProtected(int noProtected) {
        this.noProtected = noProtected;
    }

    public void setNoPrivate(int noPrivate) {
        this.noPrivate = noPrivate;
    }

    public void setNoDefault(int noDefault) {
        this.noDefault = noDefault;
    }

    public void setNoTry(int noTry) {
        this.noTry = noTry;
    }

    public void setNoSwitch(int noSwitch) {
        this.noSwitch = noSwitch;
    }

    public void setNoCase(int noCase) {
        this.noCase = noCase;
    }

    public void setNoBreak(int noBreak) {
        this.noBreak = noBreak;
    }

    public void setNoDo(int noDo) {
        this.noDo = noDo;
    }

    public void setNoFinal(int noFinal) {
        this.noFinal = noFinal;
    }

    public void setNoFinally(int noFinally) {
        this.noFinally = noFinally;
    }

    public void setNoCons(int noCons) {
        this.noCons = noCons;
    }

    public void setNoFloat(int noFloat) {
        this.noFloat = noFloat;
    }

    public void setNoStatic(int noStatic) {
        this.noStatic = noStatic;
    }

    public void setNoFor(int noFor) {
        this.noFor = noFor;
    }

    public void setNoSuper(int noSuper) {
        this.noSuper = noSuper;
    }

    public void setNoSyncronized(int noSyncronized) {
        this.noSyncronized = noSyncronized;
    }

    public void setNoTrue(int noTrue) {
        this.noTrue = noTrue;
    }

    public void setNoFalse(int noFalse) {
        this.noFalse = noFalse;
    }

    public void setNoNative(int noNative) {
        this.noNative = noNative;
    }

    public void setNoNew(int noNew) {
        this.noNew = noNew;
    }

    public void setNoNull(int noNull) {
        this.noNull = noNull;
    }

    public void setNoPackage(int noPackage) {
        this.noPackage = noPackage;
    }

    public void setNoVoid(int noVoid) {
        this.noVoid = noVoid;
    }

    public void setNoReturn(int noReturn) {
        this.noReturn = noReturn;
    }

    public void setNoVolatile(int noVolatile) {
        this.noVolatile = noVolatile;
    }

    public void setNoContinue(int noContinue) {
        this.noContinue = noContinue;
    }

    public void setNoStrictfp(int noStrictfp) {
        this.noStrictfp = noStrictfp;
    }

    public void setNoTransient(int noTransient) {
        this.noTransient = noTransient;
    }

    public void setNoImplements(int noImplements) {
        this.noImplements = noImplements;
    }

    public void setNoImport(int noImport) {
        this.noImport = noImport;
    }

    public void setNoInstanceof(int noInstanceof) {
        this.noInstanceof = noInstanceof;
    }

    public void setNoInterface(int noInterface) {
        this.noInterface = noInterface;
    }

    public void setNoGoto(int noGoto) {
        this.noGoto = noGoto;
    }

    public void setNoRnum(int noRnum) {
        this.noRnum = noRnum;
    }

    public void setNoExtends(int noExtends) {
        this.noExtends = noExtends;
    }

    public void setNoAbstract(int noAbstract) {
        this.noAbstract = noAbstract;
    }

    public void setNoAssert(int noAssert) {
        this.noAssert = noAssert;
    }

    public void setNoConst(int noConst) {
        this.noConst = noConst;
    }

    public void setNoByte(int noByte) {
        this.noByte = noByte;
    }

    //========================================================================
    public static String getFilename() {
        return filename;
    }

    public int getNoMain() {
        return noMain;
    }

    public int getNoThis() {
        return noThis;
    }

    public int getNoWhile() {
        return noWhile;
    }

    public int getNoIf() {
        return noIf;
    }

    public int getNoClass() {
        return noClass;
    }

    public int getNoCatch() {
        return noCatch;
    }

    public int getNoThrow() {
        return noThrow;
    }

    public int getNoThrows() {
        return noThrows;
    }

    public int getNoString() {
        return noString;
    }

    public int getNoInt() {
        return noInt;
    }

    public int getNoDouble() {
        return noDouble;
    }

    public int getNoShort() {
        return noShort;
    }

    public int getNoBoolean() {
        return noBoolean;
    }

    public int getNoLong() {
        return noLong;
    }

    public int getNoChar() {
        return noChar;
    }

    public int getNoPublic() {
        return noPublic;
    }

    public int getNoProtected() {
        return noProtected;
    }

    public int getNoPrivate() {
        return noPrivate;
    }

    public int getNoDefault() {
        return noDefault;
    }

    public int getNoTry() {
        return noTry;
    }

    public int getNoSwitch() {
        return noSwitch;
    }

    public int getNoCase() {
        return noCase;
    }

    public int getNoBreak() {
        return noBreak;
    }

    public int getNoDo() {
        return noDo;
    }

    public int getNoFinal() {
        return noFinal;
    }

    public int getNoFinally() {
        return noFinally;
    }

    public int getNoCons() {
        return noCons;
    }

    public int getNoFloat() {
        return noFloat;
    }

    public int getNoStatic() {
        return noStatic;
    }

    public int getNoFor() {
        return noFor;
    }

    public int getNoSuper() {
        return noSuper;
    }

    public int getNoSyncronized() {
        return noSyncronized;
    }

    public int getNoTrue() {
        return noTrue;
    }

    public int getNoFalse() {
        return noFalse;
    }

    public int getNoNative() {
        return noNative;
    }

    public int getNoNew() {
        return noNew;
    }

    public int getNoNull() {
        return noNull;
    }

    public int getNoPackage() {
        return noPackage;
    }

    public int getNoVoid() {
        return noVoid;
    }

    public int getNoReturn() {
        return noReturn;
    }

    public int getNoVolatile() {
        return noVolatile;
    }

    public int getNoContinue() {
        return noContinue;
    }

    public int getNoStrictfp() {
        return noStrictfp;
    }

    public int getNoTransient() {
        return noTransient;
    }

    public int getNoImplements() {
        return noImplements;
    }

    public int getNoImport() {
        return noImport;
    }

    public int getNoInstanceof() {
        return noInstanceof;
    }

    public int getNoInterface() {
        return noInterface;
    }

    public int getNoGoto() {
        return noGoto;
    }

    public int getNoRnum() {
        return noRnum;
    }

    public int getNoExtends() {
        return noExtends;
    }

    public int getNoAbstract() {
        return noAbstract;
    }

    public int getNoAssert() {
        return noAssert;
    }

    public int getNoConst() {
        return noConst;
    }

    public int getNoByte() {
        return noByte;
    }


  

//================================================================================
    public int countMain(String[] jList, int noMain) {

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String search;
                while ((search = readLine.readLine()) != null) {
                    if (search.contains("main")) {
                        noMain++;
                    }

                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("main " + noMain);

        return noMain;
    }

    public int countThis(String[] jList, int noThis) {

        //int noThis = 0, noWhile = 0, noMain = 0;
        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String search;
                while ((search = readLine.readLine()) != null) {
                    if (search.contains("this")) {
                        noThis++;
                    }

                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("this " + noThis);

        // System.out.println("");
        return noThis;
    }

    public int countWhile(String[] jList, int noWhile) {

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchWhile;
                while ((searchWhile = readLine.readLine()) != null) {
                    if (searchWhile.contains("while")) {
                        noWhile++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("while " + noWhile);
        return noWhile;
    }

    public int countFor(String[] jList, int noFor) {

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchFor;
                while ((searchFor = readLine.readLine()) != null) {
                    if (searchFor.contains("for")) {
                        noFor++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("For " + noFor);
        return noFor;
    }

    public int countNew(String[] jList) {

        int noNew = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchNew;
                while ((searchNew = readLine.readLine()) != null) {
                    if (searchNew.contains("new")) {
                        noNew++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("new " + noNew);
        return noNew;
    }

    public int countTry(String[] jList) {

        int noTry = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchTry;
                while ((searchTry = readLine.readLine()) != null) {
                    if (searchTry.contains("try")) {
                        noTry++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("try " + noTry);
        return noTry;
    }

    public int countCatch(String[] jList) {

        int noCatch = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchCatch;
                while ((searchCatch = readLine.readLine()) != null) {
                    if (searchCatch.contains("Catch")) {
                        noCatch++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Catch " + noCatch);
        return noCatch;
    }

    public int countVoid(String[] jList) {

        int noVoid = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchVoid;
                while ((searchVoid = readLine.readLine()) != null) {
                    if (searchVoid.contains("void")) {
                        noVoid++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("void " + noVoid);
        return noVoid;
    }

    public int countPublic(String[] jList) {

        int noPublic = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchPublic;
                while ((searchPublic = readLine.readLine()) != null) {
                    if (searchPublic.contains("public")) {
                        noPublic++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("public " + noPublic);
        return noPublic;
    }

    public int countStatic(String[] jList) {

        int noStatic = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchStatic;
                while ((searchStatic = readLine.readLine()) != null) {
                    if (searchStatic.contains("static")) {
                        noStatic++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("static " + noStatic);
        return noStatic;
    }

    public int countInt(String[] jList) {

        int noInt = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchInt;
                while ((searchInt = readLine.readLine()) != null) {
                    if (searchInt.contains("int")) {
                        noInt++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("int " + noInt);
        return noInt;
    }

    public int countDouble(String[] jList) {

        int noDouble = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchDouble;
                while ((searchDouble = readLine.readLine()) != null) {
                    if (searchDouble.contains("double")) {
                        noDouble++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("double " + noDouble);
        return noDouble;
    }

    public int countString(String[] jList) {

        int noString = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchString;
                while ((searchString = readLine.readLine()) != null) {
                    if (searchString.contains("String")) {
                        noString++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("String " + noString);
        return noString;
    }

    public int countFloat(String[] jList) {

        int noFloat = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchFloat;
                while ((searchFloat = readLine.readLine()) != null) {
                    if (searchFloat.contains("float")) {
                        noFloat++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("float " + noFloat);
        return noFloat;
    }

    public int countDo(String[] jList) {

        int noDo = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchDo;
                while ((searchDo = readLine.readLine()) != null) {
                    if (searchDo.contains("do")) {
                        noDo++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("do " + noDo);
        return noDo;
    }

    public int countFinal(String[] jList) {

        int noFinal = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchFinal;
                while ((searchFinal = readLine.readLine()) != null) {
                    if (searchFinal.contains("final")) {
                        noFinal++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("final " + noFinal);
        return noFinal;
    }

    public int countLong(String[] jList) {

        int noLong = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchLong;
                while ((searchLong = readLine.readLine()) != null) {
                    if (searchLong.contains("long")) {
                        noLong++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("long " + noLong);
        return noLong;
    }

    public int countThrow(String[] jList) {

        int noThrow = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchThrow;
                while ((searchThrow = readLine.readLine()) != null) {
                    if (searchThrow.contains("throw")) {
                        noThrow++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("throw " + noThrow);
        return noThrow;
    }

    public int countThrows(String[] jList) {

        int noThrows = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchThrows;
                while ((searchThrows = readLine.readLine()) != null) {
                    if (searchThrows.contains("throws")) {
                        noThrows++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("throws " + noThrows);
        return noThrows;
    }

    public int countIf(String[] jList) {

        int noIf = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchIf;
                while ((searchIf = readLine.readLine()) != null) {
                    if (searchIf.contains("if")) {
                        noIf++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("if " + noIf);
        return noIf;
    }

    public int countPrivate(String[] jList) {

        int noPrivate = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchPrivate;
                while ((searchPrivate = readLine.readLine()) != null) {
                    if (searchPrivate.contains("private")) {
                        noPrivate++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("private " + noPrivate);
        return noPrivate;
    }

    public int countDefault(String[] jList) {

        int noDefault = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchDefault;
                while ((searchDefault = readLine.readLine()) != null) {
                    if (searchDefault.contains("default")) {
                        noDefault++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("default " + noDefault);
        return noDefault;
    }

    public int countProtected(String[] jList) {

        int noProtected = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchProtected;
                while ((searchProtected = readLine.readLine()) != null) {
                    if (searchProtected.contains("protected")) {
                        noProtected++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("protected " + noProtected);
        return noProtected;
    }

    public int countEnum(String[] jList) {

        int noEnum = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchEnum;
                while ((searchEnum = readLine.readLine()) != null) {
                    if (searchEnum.contains("enum")) {
                        noEnum++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("enum " + noEnum);
        return noEnum;
    }

    public int countNull(String[] jList) {

        int noNull = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchNull;
                while ((searchNull = readLine.readLine()) != null) {
                    if (searchNull.contains("null")) {
                        noNull++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("null " + noNull);
        return noNull;
    }

    public int countTrue(String[] jList) {

        int noTrue = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchTrue;
                while ((searchTrue = readLine.readLine()) != null) {
                    if (searchTrue.contains("true")) {
                        noTrue++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("true " + noTrue);
        return noTrue;
    }

    public int countFalse(String[] jList) {

        int noFalse = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchTrue;
                while ((searchTrue = readLine.readLine()) != null) {
                    if (searchTrue.contains("false")) {
                        noFalse++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("false " + noFalse);
        return noFalse;
    }

    public int countAbstract(String[] jList) {

        int noAbstract = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchAbstract;
                while ((searchAbstract = readLine.readLine()) != null) {
                    if (searchAbstract.contains("abstract")) {
                        noAbstract++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("abstract " + noAbstract);
        return noAbstract;
    }

    public int countClass(String[] jList) {

        int noClass = 0;
        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchClass;
                while ((searchClass = readLine.readLine()) != null) {
                    if (searchClass.contains("class")) {
                        noClass++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("class " + noClass);
        return noClass;
    }

    public int countImplements(String[] jList) {

        int noImplements = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchImplements;
                while ((searchImplements = readLine.readLine()) != null) {
                    if (searchImplements.contains("implements")) {
                        noImplements++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("implements " + noImplements);
        return noImplements;
    }

    public int countReturn(String[] jList) {

        int noReturn = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchReturn;
                while ((searchReturn = readLine.readLine()) != null) {
                    if (searchReturn.contains("return")) {
                        noReturn++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("return " + noReturn);
        return noReturn;
    }

    public int countInstanceOf(String[] jList) {

        int noInstanceOf = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchInstanceOf;
                while ((searchInstanceOf = readLine.readLine()) != null) {
                    if (searchInstanceOf.contains("instanceof")) {
                        noInstanceOf++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("instanceof " + noInstanceOf);
        return noInstanceOf;
    }

    public int countExtends(String[] jList) {

        int noExtends = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchExtends;
                while ((searchExtends = readLine.readLine()) != null) {
                    if (searchExtends.contains("extends")) {
                        noExtends++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("extends " + noExtends);
        return noExtends;
    }

    public int countContinue(String[] jList) {

        int noContinue = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchContinue;
                while ((searchContinue = readLine.readLine()) != null) {
                    if (searchContinue.contains("continue")) {
                        noContinue++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("continue " + noContinue);
        return noContinue;
    }

    public int countChar(String[] jList) {

        int noChar = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchChar;
                while ((searchChar = readLine.readLine()) != null) {
                    if (searchChar.contains("char")) {
                        noChar++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("char " + noChar);
        return noChar;
    }

    public int countImport(String[] jList) {

        int noImport = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchImport;
                while ((searchImport = readLine.readLine()) != null) {
                    if (searchImport.contains("import")) {
                        noImport++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("import " + noImport);
        return noImport;
    }

    public int countBoolean(String[] jList) {

        int noBoolean = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchBoolean;
                while ((searchBoolean = readLine.readLine()) != null) {
                    if (searchBoolean.contains("boolean")) {
                        noBoolean++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("boolean " + noBoolean);
        return noBoolean;
    }

    public int countSwitch(String[] jList) {

        int noSwitch = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchSwitch;
                while ((searchSwitch = readLine.readLine()) != null) {
                    if (searchSwitch.contains("switch")) {
                        noSwitch++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("switch " + noSwitch);
        return noSwitch;
    }

    public int countCase(String[] jList) {

        int noCase = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchCase;
                while ((searchCase = readLine.readLine()) != null) {
                    if (searchCase.contains("case")) {
                        noCase++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("case " + noCase);
        return noCase;
    }

    public int countByte(String[] jList) {

        int noByte = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchByte;
                while ((searchByte = readLine.readLine()) != null) {
                    if (searchByte.contains("byte")) {
                        noByte++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("byte " + noByte);
        return noByte;
    }

    public int countBreak(String[] jList) {

        int noBreak = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchBreak;
                while ((searchBreak = readLine.readLine()) != null) {
                    if (searchBreak.contains("break")) {
                        noBreak++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("break " + noBreak);
        return noBreak;
    }

    public int countInterface(String[] jList) {

        int noInterface = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchInterface;
                while ((searchInterface = readLine.readLine()) != null) {
                    if (searchInterface.contains("interface")) {
                        noInterface++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("interface " + noInterface);
        return noInterface;
    }

    public int countVolatile(String[] jList) {

        int noVolatile = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchVolatile;
                while ((searchVolatile = readLine.readLine()) != null) {
                    if (searchVolatile.contains("volatile")) {
                        noVolatile++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("volatile " + noVolatile);
        return noVolatile;
    }

    public int countNative(String[] jList) {

        int noNative = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchNative;
                while ((searchNative = readLine.readLine()) != null) {
                    if (searchNative.contains("native")) {
                        noNative++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("native " + noNative);
        return noNative;
    }

    public int countShort(String[] jList) {

        int noShort = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchShort;
                while ((searchShort = readLine.readLine()) != null) {
                    if (searchShort.contains("short")) {
                        noShort++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("short " + noShort);
        return noShort;
    }

    public int countSuper(String[] jList) {

        int noSuper = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchSuper;
                while ((searchSuper = readLine.readLine()) != null) {
                    if (searchSuper.contains("super")) {
                        noSuper++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("super " + noSuper);
        return noSuper;
    }

    public int countTransient(String[] jList) {

        int noTransient = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchTransient;
                while ((searchTransient = readLine.readLine()) != null) {
                    if (searchTransient.contains("transient")) {
                        noTransient++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("transient " + noTransient);
        return noTransient;
    }

    public int countGoto(String[] jList) {

        int noGoto = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchGoto;
                while ((searchGoto = readLine.readLine()) != null) {
                    if (searchGoto.contains("goto")) {
                        noGoto++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("goto " + noGoto);
        return noGoto;
    }

    //strictfp
    public int countStrictft(String[] jList) {

        int noStrictft = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchStrictft;
                while ((searchStrictft = readLine.readLine()) != null) {
                    if (searchStrictft.contains("strictft")) {
                        noStrictft++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("strictft " + noStrictft);
        return noStrictft;
    }

    public int countSynchronized(String[] jList) {

     int noSynchronized=0;
        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchSynchronized;
                while ((searchSynchronized = readLine.readLine()) != null) {
                    if (searchSynchronized.contains("syncronized")) {
                        noSynchronized++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("syncronized " + noSynchronized);
        return noSynchronized;
    }

    //Finally
    public int countFinally(String[] jList) {

     
        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchFinally;
                while ((searchFinally = readLine.readLine()) != null) {
                    if (searchFinally.contains("finally")) {
                        noFinally++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("finally " + noFinally);
        return noFinally;
    }

    //else
    public int countElse(String[] jList) {


        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchElse;
                while ((searchElse = readLine.readLine()) != null) {
                    if (searchElse.contains("else")) {
                        noElse++;
                    }

                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("else " + noElse);

        return noElse;
    }

    public int countPackage(String[] jList) {

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchPackage;
                while ((searchPackage = readLine.readLine()) != null) {
                    if (searchPackage.contains("package")) {
                        noPackage++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("package " + noPackage);
        return noPackage;
    }

    public int countLines(String[] jList) {

        int noLines = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchLines;
                while ((searchLines = readLine.readLine()) != null) {
                    noLines++;
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number of Line(s) " + noLines);

        return noLines;
    }

    public int countBLines(String[] jList) {

        int noBLines = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchBLines;
                while (!(searchBLines = readLine.readLine()).isEmpty()) {
                    noBLines++;
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number of blank Line(s) " + noBLines);
        return noBLines;
    }
    //==============================================================================

    public static void main(String[] args) {
        new Thread(new RunSystem()).start();
    }

    @Override
    public void run() {
        
        CountComment cc=new CountComment();
        CountReserved issue = new CountReserved(); //CariIssue class
        String[] jList = issue.listJavaFile; //call method cariJavaIssue()

        try {
            //countLines(jList);
            //countBLines(jList);
            System.out.println("Actual LOC " + (countLines(jList) - countBLines(jList)));
            cc.countComment(jList);
            countPackage(jList);
            countClass(jList);
            countExtends(jList);
            countMain(jList, noMain);
            countThis(jList, noThis);
            countWhile(jList, noWhile);
            countFor(jList, noFor);
            countNew(jList);
            countTry(jList);
            countCatch(jList);
            countVoid(jList);
            countPublic(jList);
            countStatic(jList);//10
            countInt(jList);
            countDouble(jList);
            countString(jList);
            countFloat(jList);
            countDo(jList);
            countFinal(jList);
            countLong(jList);
            countThrow(jList);
            countThrows(jList);
            countIf(jList);//20
            countPrivate(jList);
            countDefault(jList);
            countProtected(jList);
            countNull(jList);
            countEnum(jList);
            countTrue(jList);
            countFalse(jList);
            countAbstract(jList);
            countImplements(jList);//30
            countReturn(jList);
            countInstanceOf(jList);
            countContinue(jList);
            countChar(jList);
            countImport(jList);
            countBoolean(jList);
            countSwitch(jList);
            countCase(jList);
            countBreak(jList);//40
            countByte(jList);
            countInterface(jList);
            countVolatile(jList);
            countNative(jList);
            countShort(jList);
            countSuper(jList);
            countTransient(jList);
            countGoto(jList);
            countStrictft(jList);
            countSynchronized(jList);//50+1
            countFinally(jList);
            countElse(jList);

            sleep(500);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

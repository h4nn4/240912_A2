/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 2
 *
 */
public class CountReserved {

    public String[] listJavaFile;

    public String[] getListJavaFile(String[] listJavaFile) {
        return listJavaFile;
    }

    public CountReserved() {
        File searchIssue;
        Collection<File> all = new ArrayList<>();
        scanFolder(new File("C:/Users/Asus/Documents/SEM5/Real-time_Programming/TestFile_ASG2"), all); //scan folder
        Collection<File> listAllFile = all;
        ArrayList<String> simpanJava = new ArrayList();
        Iterator<File> iterate = listAllFile.iterator();
        while (iterate.hasNext()) {
            searchIssue = iterate.next();
            if (searchIssue.getName().endsWith(".java")) {
                simpanJava.add(searchIssue.getAbsolutePath());
                System.out.println("File " + searchIssue.getName());
            }

            String[] listIssue = new String[simpanJava.size()];
            for (int i = 0; i < simpanJava.size(); i++) {
                listIssue[i] = simpanJava.get(i);

            }

            listJavaFile = listIssue;

        }
    }

    public void scanFolder(File file, Collection<File> all) {
        File[] dalamFolder = file.listFiles();
        if (dalamFolder != null) {
            for (File child : dalamFolder) {
                all.add(child);
                scanFolder(child, all);
            }
        }
    }
}//class


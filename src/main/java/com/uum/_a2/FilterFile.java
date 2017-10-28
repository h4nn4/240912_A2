/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 2
 *
 */
public class FilterFile {

    public String[] javaList;

    FilterFile() {
        //this.javaList = javaList;
        //File searchReserved;
        Collection <File>all=new LinkedList<>();
        scanFolder(new File("C:/Users/Asus/Documents/SEM5/Real-time_Programming/TestFile_ASG2"), all); //scan folder
        Collection<File> storeJava=all;
        String[] f = null;
        javaList=cariJava(storeJava,f);
    }
    
    public String[] cariJava(Collection<File> storeJava, String[] f){
        LinkedList<String> list=new LinkedList();
        Iterator<File> javaL=storeJava.iterator();
        //String[] listJavaFile=new String[list.size()];
        try{
        File found;
        while(javaL.hasNext()){
            found=javaL.next();
            if(found.getName().endsWith(".java")){
                list.add(found.getAbsolutePath());
                System.out.println("File Name: "+found.getName());
      
        }//for
           
        }
        }catch(Exception e){
            
        }
                String[] listJavaFile=new String[list.size()];

            for(int i=0;i<list.size();i++){
                listJavaFile[i]=list.get(i);
            }
        System.out.println("Java Files: "+list.size());
        return listJavaFile;
    }

    public static void scanFolder(File file, Collection<File> all) {
        File[] dalamFolder = file.listFiles();
        if (dalamFolder != null) {
            for (File child : dalamFolder) {
                all.add(child);
                scanFolder(child, all);
            }
        }
    }//end scanFolder

}//end class


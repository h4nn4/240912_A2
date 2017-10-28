/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 2
 * 
 */
public class CountComment {
    //String[] jList;
    public int countComment(String[] jList){
        int comment=0;
        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String cari;
                while ((cari = readLine.readLine()) != null) {
                   if(cari.startsWith("//")){
                       comment++;
                   }
                   if(cari.startsWith("/*")){
                       comment++;
                       while(!(cari=readLine.readLine()).endsWith("*/")){
                           comment++;
                           break;
                       }
                   }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("comment " + comment);
        return comment;
    }
}

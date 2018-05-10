package com.company;
import java.math.BigInteger;
import java.util.Random;

public class Main {

        private static Random rnd=new Random();
        public static void main(String[] args){
            StringBuffer word=null;
            switch(rnd.nextInt(2)){
                case 0: word=new StringBuffer("P");
                case 1: word=new StringBuffer("G");}
            word.append("a");word.append("i");word.append("n");
            System.out.println(word);}
        }
package com.bl.program.day14;
import java8.lambdaexpression.test;

    //--java 1.7

//---Functional Interface


    @FunctionalInteface
Public interface Parent{

        public void sayHello();

    }


    class MyImple implements Parent{

        public void sayHello(){

            System.out.prinln("Hi All");
        }

    }

    class Test {
        public static void main(String [] args)
        {
            MyImple  myImple = new MyImple();
            myImple.sayHello();

        }

    }

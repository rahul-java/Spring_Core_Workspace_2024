package com.mea.app;

import com.mea.singleton.Printer;

public class SingletonTest 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        
        p1.print("Hello");
        p2.print("Hi");
        
        System.out.println(p1.hashCode() +" ::: "+ p2.hashCode());
        System.out.println("p1==p2?"+(p1==p2));
    }
}

/*
Hello World!
Printer :: 0-param-constructor
Hello
Hi
1510467688 ::: 1510467688
p1==p2?true
*/
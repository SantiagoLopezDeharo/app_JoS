package com.example.spring_first;

public class Laptop {

    private int i;
    
    public void compile()
    {
        System.out.println("compiling....  " + String.valueOf(i) );
        i++;
    }


    /**
     * @return int return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}

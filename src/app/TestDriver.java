package app;

public class TestDriver{
    public native int intMethod(int n);
    public native boolean booleanMethod(boolean b);
    
    static{
        System.load("/mnt/c/Users/lukeg/source/repos/MIDI-Drum-Sampler/bin/lib/TestDriver.lib");
        //System.loadLibrary("TestDriver");
    }

    public static void main(String[] args){
        //loadLibs(args);

        TestDriver sample = new TestDriver();
        int square = sample.intMethod(5);
        boolean bool = sample.booleanMethod(false);

        System.out.println("intMethod: " + square);
        System.out.println("boolMethod: " + bool);
    }

    private static void loadLibs(String args[]){
        for(String i : args){
            System.out.println(i);
            System.load(i);
        }
    }
}
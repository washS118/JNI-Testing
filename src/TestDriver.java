public class TestDriver{
    public native int intMethod(int n);
    public native boolean booleanMethod(boolean b);
    
    static{
        System.load("/mnt/c/Users/lukeg/source/repos/MIDI-Drum-Sampler/bin/TestDriver.lib");
        //System.loadLibrary("TestDriver");
    }

    public static void main(String[] args){
        TestDriver sample = new TestDriver();
        int square = sample.intMethod(5);
        boolean bool = sample.booleanMethod(false);

        System.out.println("intMethod: " + square);
        System.out.println("boolMethod: " + bool);
    }
}
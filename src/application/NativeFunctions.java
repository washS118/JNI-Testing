package application;

import java.io.File;

public class NativeFunctions {
	private static final String LIB_PATH = "/bin/lib";
	
	public native static int test();
	
	public static void loadLibs() {
		File folder = new File(System.getProperty("user.dir") + LIB_PATH);
        File[] files = folder.listFiles();
        for(File i : files){
            System.load(i.toString());
        }
	}
}

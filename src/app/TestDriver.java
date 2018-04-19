package app;

import java.io.File;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class TestDriver extends Application{
    private static final String BIN_DIR = "/lib";

    public native int intMethod(int n);
    public native boolean booleanMethod(boolean b);

    public static void main(String[] args){
        //loadLibs();
        Application.launch(TestDriver.class);
    }

    @Override
    public void start(Stage stage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
    
        Scene scene = new Scene(root, 300, 275);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    private static void loadLibs(){
        File folder = new File(System.getProperty("user.dir") + BIN_DIR);
        File[] files = folder.listFiles();
        for(File i : files){
            String path = i.toString();
            System.out.println(path);
            System.load(path);
        }
    }
}
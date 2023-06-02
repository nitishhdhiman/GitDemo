package TestProj;

import dev.failsafe.internal.util.Assert;

import java.io.File;

public class TestClass {

    public static void getFileName(String expectedFolderName){
        String folderPath="D:\\TX_Automate_Java\\src\\test\\resources\\testData";
        File folder=new File(folderPath);
        String[] folderList=folder.list();
        for(String s:folderList){
            File file=new File(folder,s);
            if(file.isDirectory()){
                if(file.getName().contains(expectedFolderName)){
                    System.out.println(file.getName());
                    Assert.isTrue(true,"pass");
                    break;
                }
                else{
                    System.out.println("F");
                }
            }
        }
    }
}

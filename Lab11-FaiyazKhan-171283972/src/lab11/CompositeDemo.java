/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author faiya
 */
public class CompositeDemo{
    public static void main(String[] args) {
        FileSystemComponent mainFolder = new DirectoryComponent("Year2019");
        FileSystemComponent subFolder1 = new DirectoryComponent("Jan");
        FileSystemComponent subFolder2 = new DirectoryComponent("Feb");
        
        FileSystemComponent file1Jan = new FileComponent("Jan1DataFile.txt",1000);
        FileSystemComponent file2Jan = new FileComponent("Jan2DataFile.txt",2000);
        FileSystemComponent file1Feb = new FileComponent("Feb1DataFile.txt ",3000);
        FileSystemComponent file2Feb = new FileComponent("Feb2DataFile.txt ",4000);
        
        subFolder1.addComponent(file1Jan);
        subFolder1.addComponent(file2Jan);
        subFolder2.addComponent(file1Feb);
        subFolder2.addComponent(file2Feb);
        
        mainFolder.addComponent(subFolder1);
        mainFolder.addComponent(subFolder2);
        
        System.out.println(mainFolder.getName() + " Folder size= " + mainFolder.getComponentSize() + "kb");
        System.out.println(subFolder1.getName() + " Folder size= " + subFolder1.getComponentSize() + "kb");
        System.out.println(file1Jan.getName() + " Folder size= " + file1Jan.getComponentSize() + "kb");
    }
}

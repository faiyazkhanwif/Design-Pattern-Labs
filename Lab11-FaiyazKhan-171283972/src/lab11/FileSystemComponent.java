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
public abstract class FileSystemComponent{
    private String name;
    
    FileSystemComponent(String name){
        this.name = name;
    }
    
    public void addComponent(FileSystemComponent component){
        throw new UnsupportedOperationException();
    }
    
    public FileSystemComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public int getComponentSize(){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        return name;
    }
}

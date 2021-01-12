/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.LinkedList;

/**
 *
 * @author faiya
 */
public class DirectoryComponent extends FileSystemComponent{
    LinkedList<FileSystemComponent> componentList;
    
            
    DirectoryComponent(String name){
        super(name);
        componentList = new LinkedList<>();
        
    }
    
    @Override
    public void addComponent(FileSystemComponent component){
        componentList.add(component);
    }
    
    @Override
    public FileSystemComponent getChild(int i){
        return componentList.get(i);
    }
    
    @Override
    public int  getComponentSize(){
        int size = 0;
        for (int i = 0; i < componentList.size(); i++) {
            size += getChild(i). getComponentSize();
        }
        return size;
    }
}

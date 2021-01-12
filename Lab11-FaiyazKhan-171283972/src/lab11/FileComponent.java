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
public class FileComponent extends FileSystemComponent{
    private int size;
    
    FileComponent(String name, int size){
        super(name);
        this.size = size;
    }
    
    @Override
    public int getComponentSize(){
        return size;
    }
}

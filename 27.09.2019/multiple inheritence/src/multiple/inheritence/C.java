/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple.inheritence;

/**
 *
 * @author nakibamanturzo
 */
public interface C {
    default public void plus()
    {
        System.out.println("Plus");
    }
}

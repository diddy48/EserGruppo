/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano;

/**
 *
 * @author roman
 */
public class DictionaryItemNotFoundException extends Exception {

    public DictionaryItemNotFoundException() {
        super("Elemento non trovato nel dizionario");
    }
}
